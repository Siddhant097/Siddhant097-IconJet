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


val Iconsax.Filled.Maximize1: ImageVector
    get() {
        if (_Maximize1 != null) {
            return _Maximize1!!
        }
        _Maximize1 = ImageVector.Builder(
            name = "Filled.Maximize1",
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
                moveTo(18.75f, 14f)
                curveTo(18.75f, 14.41f, 18.41f, 14.75f, 18f, 14.75f)
                curveTo(17.59f, 14.75f, 17.25f, 14.41f, 17.25f, 14f)
                verticalLineTo(12.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(17.25f)
                horizontalLineTo(14f)
                curveTo(14.41f, 17.25f, 14.75f, 17.59f, 14.75f, 18f)
                curveTo(14.75f, 18.41f, 14.41f, 18.75f, 14f, 18.75f)
                horizontalLineTo(10f)
                curveTo(9.59f, 18.75f, 9.25f, 18.41f, 9.25f, 18f)
                curveTo(9.25f, 17.59f, 9.59f, 17.25f, 10f, 17.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(12.75f)
                horizontalLineTo(6.75f)
                verticalLineTo(14f)
                curveTo(6.75f, 14.41f, 6.41f, 14.75f, 6f, 14.75f)
                curveTo(5.59f, 14.75f, 5.25f, 14.41f, 5.25f, 14f)
                verticalLineTo(10f)
                curveTo(5.25f, 9.59f, 5.59f, 9.25f, 6f, 9.25f)
                curveTo(6.41f, 9.25f, 6.75f, 9.59f, 6.75f, 10f)
                verticalLineTo(11.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(6.75f)
                horizontalLineTo(10f)
                curveTo(9.59f, 6.75f, 9.25f, 6.41f, 9.25f, 6f)
                curveTo(9.25f, 5.59f, 9.59f, 5.25f, 10f, 5.25f)
                horizontalLineTo(14f)
                curveTo(14.41f, 5.25f, 14.75f, 5.59f, 14.75f, 6f)
                curveTo(14.75f, 6.41f, 14.41f, 6.75f, 14f, 6.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(11.25f)
                horizontalLineTo(17.25f)
                verticalLineTo(10f)
                curveTo(17.25f, 9.59f, 17.59f, 9.25f, 18f, 9.25f)
                curveTo(18.41f, 9.25f, 18.75f, 9.59f, 18.75f, 10f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _Maximize1!!
    }

@Suppress("ObjectPropertyName")
private var _Maximize1: ImageVector? = null
