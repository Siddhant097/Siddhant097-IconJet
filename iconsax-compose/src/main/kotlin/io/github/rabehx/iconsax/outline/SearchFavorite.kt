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

val Iconsax.Outline.SearchFavorite: ImageVector
    get() {
        if (_SearchFavorite != null) {
            return _SearchFavorite!!
        }
        _SearchFavorite = ImageVector.Builder(
            name = "Outline.SearchFavorite",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 20.75f)
                curveTo(5.62f, 20.75f, 1.25f, 16.38f, 1.25f, 11f)
                curveTo(1.25f, 5.62f, 5.62f, 1.25f, 11f, 1.25f)
                curveTo(11.41f, 1.25f, 11.75f, 1.59f, 11.75f, 2f)
                curveTo(11.75f, 2.41f, 11.41f, 2.75f, 11f, 2.75f)
                curveTo(6.45f, 2.75f, 2.75f, 6.45f, 2.75f, 11f)
                curveTo(2.75f, 15.55f, 6.45f, 19.25f, 11f, 19.25f)
                curveTo(15.55f, 19.25f, 19.25f, 15.55f, 19.25f, 11f)
                curveTo(19.25f, 10.59f, 19.59f, 10.25f, 20f, 10.25f)
                curveTo(20.41f, 10.25f, 20.75f, 10.59f, 20.75f, 11f)
                curveTo(20.75f, 16.38f, 16.38f, 20.75f, 11f, 20.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 9.54f)
                curveTo(15.58f, 9.54f, 13.44f, 8.42f, 12.78f, 6.36f)
                curveTo(12.33f, 4.95f, 12.85f, 3.1f, 14.48f, 2.57f)
                curveTo(15.18f, 2.34f, 15.91f, 2.45f, 16.49f, 2.82f)
                curveTo(17.06f, 2.45f, 17.81f, 2.35f, 18.51f, 2.57f)
                curveTo(20.14f, 3.1f, 20.67f, 4.95f, 20.21f, 6.36f)
                curveTo(19.56f, 8.46f, 17.31f, 9.54f, 16.5f, 9.54f)
                close()
                moveTo(14.21f, 5.91f)
                curveTo(14.67f, 7.36f, 16.23f, 8.02f, 16.51f, 8.05f)
                curveTo(16.83f, 8.02f, 18.36f, 7.28f, 18.78f, 5.92f)
                curveTo(19.01f, 5.19f, 18.78f, 4.25f, 18.05f, 4.01f)
                curveTo(17.74f, 3.91f, 17.32f, 3.97f, 17.12f, 4.26f)
                curveTo(16.98f, 4.47f, 16.76f, 4.59f, 16.51f, 4.6f)
                curveTo(16.28f, 4.61f, 16.03f, 4.49f, 15.89f, 4.29f)
                curveTo(15.66f, 3.96f, 15.24f, 3.91f, 14.94f, 4f)
                curveTo(14.22f, 4.24f, 13.98f, 5.18f, 14.21f, 5.91f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.16f, 22.79f)
                curveTo(20.08f, 22.79f, 20f, 22.78f, 19.93f, 22.77f)
                curveTo(19.46f, 22.71f, 18.61f, 22.39f, 18.13f, 20.96f)
                curveTo(17.88f, 20.21f, 17.97f, 19.46f, 18.38f, 18.89f)
                curveTo(18.79f, 18.32f, 19.48f, 18f, 20.27f, 18f)
                curveTo(21.29f, 18f, 22.09f, 18.39f, 22.45f, 19.08f)
                curveTo(22.81f, 19.77f, 22.71f, 20.65f, 22.14f, 21.5f)
                curveTo(21.43f, 22.57f, 20.66f, 22.79f, 20.16f, 22.79f)
                close()
                moveTo(19.56f, 20.49f)
                curveTo(19.73f, 21.01f, 19.97f, 21.27f, 20.13f, 21.29f)
                curveTo(20.29f, 21.31f, 20.59f, 21.12f, 20.9f, 20.67f)
                curveTo(21.19f, 20.24f, 21.21f, 19.93f, 21.14f, 19.79f)
                curveTo(21.07f, 19.65f, 20.79f, 19.5f, 20.27f, 19.5f)
                curveTo(19.96f, 19.5f, 19.73f, 19.6f, 19.6f, 19.77f)
                curveTo(19.48f, 19.94f, 19.46f, 20.2f, 19.56f, 20.49f)
                close()
            }
        }.build()

        return _SearchFavorite!!
    }

@Suppress("ObjectPropertyName")
private var _SearchFavorite: ImageVector? = null
