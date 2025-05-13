/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.OmegaSquare: ImageVector
    get() {
        if (_OmegaSquare != null) {
            return _OmegaSquare!!
        }
        _OmegaSquare = ImageVector.Builder(
            name = "Filled.OmegaSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(17f, 17.5f)
                horizontalLineTo(13.9f)
                curveTo(13.6f, 17.5f, 13.33f, 17.33f, 13.21f, 17.05f)
                curveTo(13.09f, 16.77f, 13.14f, 16.46f, 13.34f, 16.24f)
                lineTo(14.96f, 14.45f)
                curveTo(15.63f, 13.7f, 16.01f, 12.75f, 16.01f, 11.77f)
                curveTo(16.01f, 10.77f, 15.6f, 9.83f, 14.85f, 9.12f)
                curveTo(14.1f, 8.41f, 13.06f, 8f, 12f, 8f)
                curveTo(10.94f, 8f, 9.9f, 8.41f, 9.15f, 9.12f)
                curveTo(8.4f, 9.83f, 7.99f, 10.77f, 7.99f, 11.77f)
                curveTo(7.99f, 12.75f, 8.36f, 13.7f, 9.04f, 14.45f)
                lineTo(10.66f, 16.24f)
                curveTo(10.86f, 16.46f, 10.91f, 16.78f, 10.79f, 17.05f)
                curveTo(10.67f, 17.32f, 10.4f, 17.5f, 10.1f, 17.5f)
                horizontalLineTo(7f)
                curveTo(6.59f, 17.5f, 6.25f, 17.16f, 6.25f, 16.75f)
                curveTo(6.25f, 16.34f, 6.59f, 16f, 7f, 16f)
                horizontalLineTo(8.41f)
                lineTo(7.92f, 15.46f)
                curveTo(7f, 14.44f, 6.49f, 13.13f, 6.49f, 11.77f)
                curveTo(6.49f, 10.38f, 7.08f, 9.01f, 8.12f, 8.03f)
                curveTo(9.16f, 7.04f, 10.53f, 6.5f, 12f, 6.5f)
                curveTo(13.47f, 6.5f, 14.84f, 7.04f, 15.88f, 8.03f)
                curveTo(16.91f, 9.01f, 17.51f, 10.38f, 17.51f, 11.77f)
                curveTo(17.51f, 13.12f, 17f, 14.43f, 16.08f, 15.46f)
                lineTo(15.59f, 16f)
                horizontalLineTo(17f)
                curveTo(17.41f, 16f, 17.75f, 16.34f, 17.75f, 16.75f)
                curveTo(17.75f, 17.16f, 17.41f, 17.5f, 17f, 17.5f)
                close()
            }
        }.build()

        return _OmegaSquare!!
    }

@Suppress("ObjectPropertyName")
private var _OmegaSquare: ImageVector? = null
