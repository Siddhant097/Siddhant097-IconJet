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

val Iconsax.Outline.LocationAdd: ImageVector
    get() {
        if (_LocationAdd != null) {
            return _LocationAdd!!
        }
        _LocationAdd = ImageVector.Builder(
            name = "Outline.LocationAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.75f, 11.75f)
                horizontalLineTo(9.25f)
                curveTo(8.84f, 11.75f, 8.5f, 11.41f, 8.5f, 11f)
                curveTo(8.5f, 10.59f, 8.84f, 10.25f, 9.25f, 10.25f)
                horizontalLineTo(14.75f)
                curveTo(15.16f, 10.25f, 15.5f, 10.59f, 15.5f, 11f)
                curveTo(15.5f, 11.41f, 15.16f, 11.75f, 14.75f, 11.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14.5f)
                curveTo(11.59f, 14.5f, 11.25f, 14.16f, 11.25f, 13.75f)
                verticalLineTo(8.25f)
                curveTo(11.25f, 7.84f, 11.59f, 7.5f, 12f, 7.5f)
                curveTo(12.41f, 7.5f, 12.75f, 7.84f, 12.75f, 8.25f)
                verticalLineTo(13.75f)
                curveTo(12.75f, 14.16f, 12.41f, 14.5f, 12f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.76f)
                curveTo(10.52f, 22.76f, 9.03f, 22.2f, 7.87f, 21.09f)
                curveTo(4.92f, 18.25f, 1.66f, 13.72f, 2.89f, 8.33f)
                curveTo(4f, 3.44f, 8.27f, 1.25f, 12f, 1.25f)
                curveTo(12f, 1.25f, 12f, 1.25f, 12.01f, 1.25f)
                curveTo(15.74f, 1.25f, 20.01f, 3.44f, 21.12f, 8.34f)
                curveTo(22.34f, 13.73f, 19.08f, 18.25f, 16.13f, 21.09f)
                curveTo(14.97f, 22.2f, 13.48f, 22.76f, 12f, 22.76f)
                close()
                moveTo(12f, 2.75f)
                curveTo(9.09f, 2.75f, 5.35f, 4.3f, 4.36f, 8.66f)
                curveTo(3.28f, 13.37f, 6.24f, 17.43f, 8.92f, 20f)
                curveTo(10.65f, 21.67f, 13.36f, 21.67f, 15.09f, 20f)
                curveTo(17.76f, 17.43f, 20.72f, 13.37f, 19.66f, 8.66f)
                curveTo(18.66f, 4.3f, 14.91f, 2.75f, 12f, 2.75f)
                close()
            }
        }.build()

        return _LocationAdd!!
    }

@Suppress("ObjectPropertyName")
private var _LocationAdd: ImageVector? = null
