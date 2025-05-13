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

val Iconsax.Outline.CardCoin: ImageVector
    get() {
        if (_CardCoin != null) {
            return _CardCoin!!
        }
        _CardCoin = ImageVector.Builder(
            name = "Outline.CardCoin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 17.81f)
                horizontalLineTo(2f)
                curveTo(1.59f, 17.81f, 1.25f, 17.47f, 1.25f, 17.06f)
                curveTo(1.25f, 16.65f, 1.59f, 16.31f, 2f, 16.31f)
                horizontalLineTo(12f)
                curveTo(12.41f, 16.31f, 12.75f, 16.65f, 12.75f, 17.06f)
                curveTo(12.75f, 17.48f, 12.41f, 17.81f, 12f, 17.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.78f, 22.75f)
                horizontalLineTo(4.23f)
                curveTo(2.04f, 22.75f, 1.26f, 21.98f, 1.26f, 19.8f)
                verticalLineTo(15.7f)
                curveTo(1.26f, 13.52f, 2.04f, 12.75f, 4.23f, 12.75f)
                horizontalLineTo(9.78f)
                curveTo(11.97f, 12.75f, 12.75f, 13.52f, 12.75f, 15.7f)
                verticalLineTo(19.81f)
                curveTo(12.75f, 21.98f, 11.97f, 22.75f, 9.78f, 22.75f)
                close()
                moveTo(4.22f, 14.25f)
                curveTo(2.86f, 14.25f, 2.75f, 14.36f, 2.75f, 15.7f)
                verticalLineTo(19.81f)
                curveTo(2.75f, 21.15f, 2.86f, 21.26f, 4.22f, 21.26f)
                horizontalLineTo(9.77f)
                curveTo(11.13f, 21.26f, 11.24f, 21.15f, 11.24f, 19.81f)
                verticalLineTo(15.7f)
                curveTo(11.24f, 14.36f, 11.13f, 14.25f, 9.77f, 14.25f)
                horizontalLineTo(4.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                curveTo(14.73f, 22.75f, 14.48f, 22.6f, 14.35f, 22.37f)
                curveTo(14.22f, 22.13f, 14.22f, 21.85f, 14.36f, 21.61f)
                lineTo(15.41f, 19.86f)
                curveTo(15.62f, 19.51f, 16.08f, 19.39f, 16.44f, 19.6f)
                curveTo(16.8f, 19.81f, 16.91f, 20.27f, 16.7f, 20.63f)
                lineTo(16.43f, 21.08f)
                curveTo(19.19f, 20.43f, 21.26f, 17.95f, 21.26f, 14.99f)
                curveTo(21.26f, 14.58f, 21.6f, 14.24f, 22.01f, 14.24f)
                curveTo(22.42f, 14.24f, 22.76f, 14.58f, 22.76f, 14.99f)
                curveTo(22.75f, 19.27f, 19.27f, 22.75f, 15f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 9.75f)
                curveTo(1.59f, 9.75f, 1.25f, 9.41f, 1.25f, 9f)
                curveTo(1.25f, 4.73f, 4.73f, 1.25f, 9f, 1.25f)
                curveTo(9.27f, 1.25f, 9.52f, 1.4f, 9.65f, 1.63f)
                curveTo(9.78f, 1.87f, 9.78f, 2.15f, 9.64f, 2.39f)
                lineTo(8.59f, 4.14f)
                curveTo(8.38f, 4.49f, 7.92f, 4.61f, 7.56f, 4.4f)
                curveTo(7.2f, 4.19f, 7.09f, 3.73f, 7.3f, 3.37f)
                lineTo(7.57f, 2.92f)
                curveTo(4.81f, 3.57f, 2.74f, 6.05f, 2.74f, 9.01f)
                curveTo(2.75f, 9.41f, 2.41f, 9.75f, 2f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.5f, 11.75f)
                curveTo(15.61f, 11.75f, 13.25f, 9.4f, 13.25f, 6.5f)
                curveTo(13.25f, 3.6f, 15.6f, 1.25f, 18.5f, 1.25f)
                curveTo(21.4f, 1.25f, 23.75f, 3.6f, 23.75f, 6.5f)
                curveTo(23.75f, 9.4f, 21.39f, 11.75f, 18.5f, 11.75f)
                close()
                moveTo(18.5f, 2.75f)
                curveTo(16.43f, 2.75f, 14.75f, 4.43f, 14.75f, 6.5f)
                curveTo(14.75f, 8.57f, 16.43f, 10.25f, 18.5f, 10.25f)
                curveTo(20.57f, 10.25f, 22.25f, 8.57f, 22.25f, 6.5f)
                curveTo(22.25f, 4.43f, 20.57f, 2.75f, 18.5f, 2.75f)
                close()
            }
        }.build()

        return _CardCoin!!
    }

@Suppress("ObjectPropertyName")
private var _CardCoin: ImageVector? = null
