package com.behzad.viewmodel.train

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.behzad.viewmodel.R
import com.behzad.viewmodel.ui.theme.LocalSpacing

@Composable
fun TrainScreen(
    viewModel: TrainViewModel
) {
    val spacing = LocalSpacing.current
    val state = viewModel.state




    Column(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .fillMaxSize()
            .padding(horizontal = spacing.spaceXXXLarge, vertical = spacing.spaceXXXLarge),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = state.name,
            onValueChange = { viewModel.onAction(TrainAction.UpdateName(it)) },
            label = { Text(text = "NAME") }
        )

        OutlinedTextField(
            value = state.surName,
            onValueChange = { viewModel.onAction(TrainAction.UpdateSurName(it)) },
            label = { Text(text = "SURNAME") },
            modifier = Modifier.padding(top = spacing.spaceLarge)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = spacing.spaceLarge),
            horizontalArrangement = Arrangement.Center
        ) {
            OutlinedButton(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    viewModel.onAction(TrainAction.Submit(state.name, state.surName))
                }
            ) {
                Text(
                    text = stringResource(id = R.string.sumbmit),
                    style = MaterialTheme.typography.labelLarge,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }

        if (state.isSubmitted){

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = spacing.spaceLarge)
                    .border(
                        width = spacing.spaceExtraExtraExtraSmall,
                        color = MaterialTheme.colorScheme.primary
                    ),
            ) {
                Text(
                    text =  state.name,
                    modifier = Modifier.padding(spacing.spaceMedium)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = spacing.spaceLarge)
                    .border(
                        width = spacing.spaceExtraExtraExtraSmall,
                        color = MaterialTheme.colorScheme.primary
                    )
            ) {
                Text(
                    text = state.surName,
                    modifier = Modifier.padding(spacing.spaceMedium)
                )
            }
        }


    }

}

@Composable
@Preview
fun TrainScreenPreview() {
    TrainScreen(viewModel = TrainViewModel())
}
