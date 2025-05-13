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

val Iconsax.Outline.MessageNotif: ImageVector
    get() {
        if (_MessageNotif != null) {
            return _MessageNotif!!
        }
        _MessageNotif = ImageVector.Builder(
            name = "Outline.MessageNotif",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.81f)
                curveTo(11.31f, 22.81f, 10.66f, 22.46f, 10.2f, 21.85f)
                lineTo(8.7f, 19.85f)
                curveTo(8.67f, 19.81f, 8.55f, 19.75f, 8.49f, 19.75f)
                horizontalLineTo(8f)
                curveTo(3.83f, 19.75f, 1.25f, 18.62f, 1.25f, 13f)
                verticalLineTo(8f)
                curveTo(1.25f, 3.58f, 3.58f, 1.25f, 8f, 1.25f)
                horizontalLineTo(14f)
                curveTo(14.41f, 1.25f, 14.75f, 1.59f, 14.75f, 2f)
                curveTo(14.75f, 2.41f, 14.41f, 2.75f, 14f, 2.75f)
                horizontalLineTo(8f)
                curveTo(4.42f, 2.75f, 2.75f, 4.42f, 2.75f, 8f)
                verticalLineTo(13f)
                curveTo(2.75f, 17.52f, 4.3f, 18.25f, 8f, 18.25f)
                horizontalLineTo(8.5f)
                curveTo(9.01f, 18.25f, 9.59f, 18.54f, 9.9f, 18.95f)
                lineTo(11.4f, 20.95f)
                curveTo(11.75f, 21.41f, 12.25f, 21.41f, 12.6f, 20.95f)
                lineTo(14.1f, 18.95f)
                curveTo(14.43f, 18.51f, 14.95f, 18.25f, 15.5f, 18.25f)
                horizontalLineTo(16f)
                curveTo(19.58f, 18.25f, 21.25f, 16.58f, 21.25f, 13f)
                verticalLineTo(10f)
                curveTo(21.25f, 9.59f, 21.59f, 9.25f, 22f, 9.25f)
                curveTo(22.41f, 9.25f, 22.75f, 9.59f, 22.75f, 10f)
                verticalLineTo(13f)
                curveTo(22.75f, 17.42f, 20.42f, 19.75f, 16f, 19.75f)
                horizontalLineTo(15.5f)
                curveTo(15.42f, 19.75f, 15.35f, 19.79f, 15.3f, 19.85f)
                lineTo(13.8f, 21.85f)
                curveTo(13.34f, 22.46f, 12.69f, 22.81f, 12f, 22.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 12f)
                curveTo(11.44f, 12f, 11f, 11.55f, 11f, 11f)
                curveTo(11f, 10.45f, 11.45f, 10f, 12f, 10f)
                curveTo(12.55f, 10f, 13f, 10.45f, 13f, 11f)
                curveTo(13f, 11.55f, 12.56f, 12f, 12f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 12f)
                curveTo(15.44f, 12f, 15f, 11.55f, 15f, 11f)
                curveTo(15f, 10.45f, 15.45f, 10f, 16f, 10f)
                curveTo(16.55f, 10f, 17f, 10.45f, 17f, 11f)
                curveTo(17f, 11.55f, 16.56f, 12f, 16f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 12f)
                curveTo(7.44f, 12f, 7f, 11.55f, 7f, 11f)
                curveTo(7f, 10.45f, 7.45f, 10f, 8f, 10f)
                curveTo(8.55f, 10f, 9f, 10.45f, 9f, 11f)
                curveTo(9f, 11.55f, 8.56f, 12f, 8f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.5f, 7.75f)
                curveTo(17.71f, 7.75f, 16.25f, 6.29f, 16.25f, 4.5f)
                curveTo(16.25f, 2.71f, 17.71f, 1.25f, 19.5f, 1.25f)
                curveTo(21.29f, 1.25f, 22.75f, 2.71f, 22.75f, 4.5f)
                curveTo(22.75f, 6.29f, 21.29f, 7.75f, 19.5f, 7.75f)
                close()
                moveTo(19.5f, 2.75f)
                curveTo(18.54f, 2.75f, 17.75f, 3.54f, 17.75f, 4.5f)
                curveTo(17.75f, 5.46f, 18.54f, 6.25f, 19.5f, 6.25f)
                curveTo(20.46f, 6.25f, 21.25f, 5.46f, 21.25f, 4.5f)
                curveTo(21.25f, 3.54f, 20.46f, 2.75f, 19.5f, 2.75f)
                close()
            }
        }.build()

        return _MessageNotif!!
    }

@Suppress("ObjectPropertyName")
private var _MessageNotif: ImageVector? = null
