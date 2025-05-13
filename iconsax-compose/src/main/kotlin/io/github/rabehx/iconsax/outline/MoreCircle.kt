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

val Iconsax.Outline.MoreCircle: ImageVector
    get() {
        if (_MoreCircle != null) {
            return _MoreCircle!!
        }
        _MoreCircle = ImageVector.Builder(
            name = "Outline.MoreCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 13f)
                curveTo(11.44f, 13f, 11f, 12.55f, 11f, 12f)
                curveTo(11f, 11.45f, 11.45f, 11f, 12f, 11f)
                curveTo(12.55f, 11f, 13f, 11.45f, 13f, 12f)
                curveTo(13f, 12.55f, 12.56f, 13f, 12f, 13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 13f)
                curveTo(15.44f, 13f, 15f, 12.55f, 15f, 12f)
                curveTo(15f, 11.45f, 15.45f, 11f, 16f, 11f)
                curveTo(16.55f, 11f, 17f, 11.45f, 17f, 12f)
                curveTo(17f, 12.55f, 16.56f, 13f, 16f, 13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 13f)
                curveTo(7.44f, 13f, 7f, 12.55f, 7f, 12f)
                curveTo(7f, 11.45f, 7.45f, 11f, 8f, 11f)
                curveTo(8.55f, 11f, 9f, 11.45f, 9f, 12f)
                curveTo(9f, 12.55f, 8.56f, 13f, 8f, 13f)
                close()
            }
        }.build()

        return _MoreCircle!!
    }

@Suppress("ObjectPropertyName")
private var _MoreCircle: ImageVector? = null
