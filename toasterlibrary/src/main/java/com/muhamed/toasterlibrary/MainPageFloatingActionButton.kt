package com.muhamed.toasterlibrary

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.res.stringResource
import kotlinx.coroutines.CoroutineScope

@Composable
fun MainPageFloatingActionButton(
    onClick: (CoroutineScope) -> Unit
){
    val scope = rememberCoroutineScope()
    FloatingActionButton(
        onClick = { onClick(scope) }
    ) {
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = stringResource(id = R.string.add_string)
        )
    }
}