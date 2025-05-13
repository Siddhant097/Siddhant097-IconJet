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

val Iconsax.Outline.ShieldCross: ImageVector
    get() {
        if (_ShieldCross != null) {
            return _ShieldCross!!
        }
        _ShieldCross = ImageVector.Builder(
            name = "Outline.ShieldCross",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.76f)
                curveTo(10.91f, 22.76f, 9.83f, 22.44f, 8.98f, 21.81f)
                lineTo(4.68f, 18.6f)
                curveTo(3.54f, 17.75f, 2.65f, 15.97f, 2.65f, 14.56f)
                verticalLineTo(7.12f)
                curveTo(2.65f, 5.58f, 3.78f, 3.94f, 5.23f, 3.4f)
                lineTo(10.22f, 1.53f)
                curveTo(11.21f, 1.16f, 12.77f, 1.16f, 13.76f, 1.53f)
                lineTo(18.75f, 3.4f)
                curveTo(20.2f, 3.94f, 21.33f, 5.58f, 21.33f, 7.12f)
                verticalLineTo(14.55f)
                curveTo(21.33f, 15.97f, 20.44f, 17.74f, 19.3f, 18.59f)
                lineTo(15f, 21.8f)
                curveTo(14.17f, 22.44f, 13.09f, 22.76f, 12f, 22.76f)
                close()
                moveTo(10.75f, 2.94f)
                lineTo(5.76f, 4.81f)
                curveTo(4.91f, 5.13f, 4.16f, 6.21f, 4.16f, 7.13f)
                verticalLineTo(14.56f)
                curveTo(4.16f, 15.51f, 4.83f, 16.84f, 5.58f, 17.4f)
                lineTo(9.88f, 20.61f)
                curveTo(11.03f, 21.47f, 12.97f, 21.47f, 14.13f, 20.61f)
                lineTo(18.43f, 17.4f)
                curveTo(19.19f, 16.83f, 19.85f, 15.51f, 19.85f, 14.56f)
                verticalLineTo(7.12f)
                curveTo(19.85f, 6.21f, 19.1f, 5.13f, 18.25f, 4.8f)
                lineTo(13.26f, 2.93f)
                curveTo(12.58f, 2.69f, 11.42f, 2.69f, 10.75f, 2.94f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.15f, 14.19f)
                curveTo(13.96f, 14.19f, 13.77f, 14.12f, 13.62f, 13.97f)
                lineTo(9.37f, 9.72f)
                curveTo(9.08f, 9.43f, 9.08f, 8.95f, 9.37f, 8.66f)
                curveTo(9.66f, 8.37f, 10.14f, 8.37f, 10.43f, 8.66f)
                lineTo(14.68f, 12.91f)
                curveTo(14.97f, 13.2f, 14.97f, 13.68f, 14.68f, 13.97f)
                curveTo(14.53f, 14.11f, 14.34f, 14.19f, 14.15f, 14.19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.849f, 14.23f)
                curveTo(9.659f, 14.23f, 9.469f, 14.16f, 9.319f, 14.01f)
                curveTo(9.029f, 13.72f, 9.029f, 13.24f, 9.319f, 12.95f)
                lineTo(13.569f, 8.7f)
                curveTo(13.859f, 8.41f, 14.339f, 8.41f, 14.629f, 8.7f)
                curveTo(14.919f, 8.99f, 14.919f, 9.47f, 14.629f, 9.76f)
                lineTo(10.379f, 14.01f)
                curveTo(10.239f, 14.16f, 10.039f, 14.23f, 9.849f, 14.23f)
                close()
            }
        }.build()

        return _ShieldCross!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldCross: ImageVector? = null
