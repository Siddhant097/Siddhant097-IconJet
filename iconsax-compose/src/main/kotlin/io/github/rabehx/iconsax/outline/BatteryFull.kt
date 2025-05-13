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

val Iconsax.Outline.BatteryFull: ImageVector
    get() {
        if (_BatteryFull != null) {
            return _BatteryFull!!
        }
        _BatteryFull = ImageVector.Builder(
            name = "Outline.BatteryFull",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.5f, 15.25f)
                curveTo(20.09f, 15.25f, 19.75f, 14.91f, 19.75f, 14.5f)
                curveTo(19.75f, 14.09f, 20.09f, 13.75f, 20.5f, 13.75f)
                curveTo(21.09f, 13.75f, 21.22f, 13.66f, 21.23f, 13.66f)
                curveTo(21.25f, 13.6f, 21.25f, 13.25f, 21.25f, 13f)
                verticalLineTo(11f)
                curveTo(21.25f, 10.75f, 21.25f, 10.41f, 21.21f, 10.32f)
                curveTo(21.2f, 10.33f, 21.05f, 10.25f, 20.5f, 10.25f)
                curveTo(20.09f, 10.25f, 19.75f, 9.91f, 19.75f, 9.5f)
                curveTo(19.75f, 9.09f, 20.09f, 8.75f, 20.5f, 8.75f)
                curveTo(22.58f, 8.75f, 22.75f, 9.77f, 22.75f, 11f)
                verticalLineTo(13f)
                curveTo(22.75f, 14.23f, 22.58f, 15.25f, 20.5f, 15.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.38f, 14.75f)
                curveTo(6.32f, 14.75f, 6.26f, 14.74f, 6.2f, 14.73f)
                curveTo(5.8f, 14.63f, 5.55f, 14.22f, 5.65f, 13.82f)
                curveTo(5.95f, 12.63f, 5.95f, 11.37f, 5.65f, 10.18f)
                curveTo(5.55f, 9.78f, 5.79f, 9.37f, 6.2f, 9.27f)
                curveTo(6.6f, 9.17f, 7f, 9.42f, 7.1f, 9.82f)
                curveTo(7.46f, 11.25f, 7.46f, 12.76f, 7.1f, 14.18f)
                curveTo(7.02f, 14.52f, 6.71f, 14.75f, 6.38f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.88f, 14.75f)
                curveTo(9.82f, 14.75f, 9.76f, 14.74f, 9.7f, 14.73f)
                curveTo(9.3f, 14.63f, 9.05f, 14.22f, 9.15f, 13.82f)
                curveTo(9.45f, 12.63f, 9.45f, 11.37f, 9.15f, 10.18f)
                curveTo(9.05f, 9.78f, 9.29f, 9.37f, 9.7f, 9.27f)
                curveTo(10.1f, 9.17f, 10.51f, 9.41f, 10.61f, 9.82f)
                curveTo(10.97f, 11.25f, 10.97f, 12.76f, 10.61f, 14.18f)
                curveTo(10.52f, 14.52f, 10.21f, 14.75f, 9.88f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.38f, 14.75f)
                curveTo(13.32f, 14.75f, 13.26f, 14.74f, 13.2f, 14.73f)
                curveTo(12.8f, 14.63f, 12.55f, 14.22f, 12.65f, 13.82f)
                curveTo(12.95f, 12.63f, 12.95f, 11.37f, 12.65f, 10.18f)
                curveTo(12.55f, 9.78f, 12.79f, 9.37f, 13.2f, 9.27f)
                curveTo(13.6f, 9.17f, 14.01f, 9.41f, 14.11f, 9.82f)
                curveTo(14.47f, 11.25f, 14.47f, 12.76f, 14.11f, 14.18f)
                curveTo(14.02f, 14.52f, 13.71f, 14.75f, 13.38f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 19.75f)
                horizontalLineTo(7f)
                curveTo(2.59f, 19.75f, 1.25f, 18.41f, 1.25f, 14f)
                verticalLineTo(10f)
                curveTo(1.25f, 5.59f, 2.59f, 4.25f, 7f, 4.25f)
                horizontalLineTo(13f)
                curveTo(17.41f, 4.25f, 18.75f, 5.59f, 18.75f, 10f)
                verticalLineTo(14f)
                curveTo(18.75f, 18.41f, 17.41f, 19.75f, 13f, 19.75f)
                close()
                moveTo(7f, 5.75f)
                curveTo(3.43f, 5.75f, 2.75f, 6.43f, 2.75f, 10f)
                verticalLineTo(14f)
                curveTo(2.75f, 17.57f, 3.43f, 18.25f, 7f, 18.25f)
                horizontalLineTo(13f)
                curveTo(16.57f, 18.25f, 17.25f, 17.57f, 17.25f, 14f)
                verticalLineTo(10f)
                curveTo(17.25f, 6.43f, 16.57f, 5.75f, 13f, 5.75f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _BatteryFull!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryFull: ImageVector? = null
