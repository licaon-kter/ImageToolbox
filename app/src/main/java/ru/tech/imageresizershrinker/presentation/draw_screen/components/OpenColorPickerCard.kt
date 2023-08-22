package ru.tech.imageresizershrinker.presentation.draw_screen.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Colorize
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import ru.tech.imageresizershrinker.R
import ru.tech.imageresizershrinker.presentation.root.theme.mixedColor
import ru.tech.imageresizershrinker.presentation.root.theme.onMixedColor
import ru.tech.imageresizershrinker.presentation.root.utils.modifier.block

@Composable
fun OpenColorPickerCard(
    onOpen: () -> Unit
) {
    Row(
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp, top = 16.dp)
            .block(
                applyResultPadding = false,
                color = MaterialTheme.colorScheme.mixedColor.copy(0.7f),
                shape = RoundedCornerShape(24.dp)
            )
            .clickable { onOpen() }
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = stringResource(id = R.string.pipette),
            modifier = Modifier.weight(1f),
            color = MaterialTheme.colorScheme.onMixedColor
        )
        Icon(
            imageVector = Icons.Rounded.Colorize,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.onMixedColor
        )
    }
}