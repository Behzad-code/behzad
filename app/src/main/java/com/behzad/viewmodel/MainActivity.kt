package com.behzad.viewmodel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.behzad.viewmodel.train.TrainScreen
import com.behzad.viewmodel.train.TrainViewModel

class MainActivity : ComponentActivity() {
    private val trainViewModel: TrainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TrainScreen(
                viewModel = trainViewModel,
            )

        }
    }
}




