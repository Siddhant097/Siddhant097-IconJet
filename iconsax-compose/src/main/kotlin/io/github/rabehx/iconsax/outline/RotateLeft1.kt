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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.RotateLeft1: ImageVector
    get() {
        if (_RotateLeft1 != null) {
            return _RotateLeft1!!
        }
        _RotateLeft1 = ImageVector.Builder(
            name = "Outline.RotateLeft1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.75f, 22.75f)
                horizontalLineTo(7.25f)
                curveTo(3.1f, 22.75f, 1.25f, 20.9f, 1.25f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(1.25f, 8.1f, 3.1f, 6.25f, 7.25f, 6.25f)
                horizontalLineTo(11.75f)
                curveTo(15.9f, 6.25f, 17.75f, 8.1f, 17.75f, 12.25f)
                verticalLineTo(16.75f)
                curveTo(17.75f, 20.9f, 15.9f, 22.75f, 11.75f, 22.75f)
                close()
                moveTo(7.25f, 7.75f)
                curveTo(3.93f, 7.75f, 2.75f, 8.93f, 2.75f, 12.25f)
                verticalLineTo(16.75f)
                curveTo(2.75f, 20.07f, 3.93f, 21.25f, 7.25f, 21.25f)
                horizontalLineTo(11.75f)
                curveTo(15.07f, 21.25f, 16.25f, 20.07f, 16.25f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(16.25f, 8.93f, 15.07f, 7.75f, 11.75f, 7.75f)
                horizontalLineTo(7.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 9.75f)
                curveTo(21.59f, 9.75f, 21.25f, 9.41f, 21.25f, 9f)
                curveTo(21.25f, 6.04f, 19.19f, 3.56f, 16.42f, 2.91f)
                lineTo(16.69f, 3.36f)
                curveTo(16.9f, 3.72f, 16.79f, 4.18f, 16.43f, 4.39f)
                curveTo(16.07f, 4.6f, 15.61f, 4.49f, 15.4f, 4.13f)
                lineTo(14.35f, 2.38f)
                curveTo(14.21f, 2.15f, 14.21f, 1.86f, 14.34f, 1.63f)
                curveTo(14.48f, 1.4f, 14.73f, 1.25f, 15f, 1.25f)
                curveTo(19.27f, 1.25f, 22.75f, 4.73f, 22.75f, 9f)
                curveTo(22.75f, 9.41f, 22.41f, 9.75f, 22f, 9.75f)
                close()
            }
        }.build()

        return _RotateLeft1!!
    }

@Suppress("ObjectPropertyName")
private var _RotateLeft1: ImageVector? = null
