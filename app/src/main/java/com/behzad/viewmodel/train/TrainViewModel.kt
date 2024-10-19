package com.behzad.viewmodel.train

import android.app.Application
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.behzad.data.local.UserDao
import com.behzad.data.local.UserModel
import com.behzad.viewmodel.MyApplication
import kotlinx.coroutines.launch

class TrainViewModel(application: Application) : AndroidViewModel(application) {

    var state by mutableStateOf(TrainState())
        private set

    private val userDao : UserDao = (application as MyApplication).database.userDao()

    fun onAction(action: TrainAction) {
        state = when (action) {
            is TrainAction.Submit -> TrainState(
                name = action.name,
                surName = action.surName,
                isSubmitted = true
            )
            is TrainAction.UpdateName -> state.copy(name = action.name)
            is TrainAction.UpdateSurName -> state.copy(surName = action.surName)
        }
    }
    private fun saveUserToDatabase(name: String, surName: String) {
        val user = UserModel(firstName = name, lastName = surName)
        viewModelScope.launch {
            userDao.insertUser(user)
        }
    }
    fun loadUsers(){
        viewModelScope.launch {
            val users = userDao.getAllUser()
        }
    }
}