package com.behzad.viewmodel.train


sealed interface TrainAction {
    data class Submit(val name: String, val surName: String) : TrainAction
    data class UpdateName(val name: String) : TrainAction
    data class UpdateSurName(val surName: String) : TrainAction
}