package com.flipperdevices.share.receive.api

import androidx.compose.runtime.Composable
import com.flipperdevices.core.di.AppGraph
import com.flipperdevices.deeplink.model.DeeplinkContent
import com.flipperdevices.share.api.ReceiveApi
import com.flipperdevices.share.receive.composable.ComposableReceive
import com.squareup.anvil.annotations.ContributesBinding
import javax.inject.Inject

@ContributesBinding(AppGraph::class)
class ReceiveApiImpl @Inject constructor() : ReceiveApi {
    @Composable
    override fun AlertDialogUpload(
        deeplinkContent: DeeplinkContent,
        flipperPath: String,
        onSuccessful: () -> Unit,
        onCancel: () -> Unit
    ) {
        ComposableReceive(
            deeplinkContent = deeplinkContent,
            flipperPath = flipperPath,
            onSuccessful = onSuccessful,
            onCancel = onCancel
        )
    }
}
