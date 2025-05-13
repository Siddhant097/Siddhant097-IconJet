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

val Iconsax.Outline.WalletRemove: ImageVector
    get() {
        if (_WalletRemove != null) {
            return _WalletRemove!!
        }
        _WalletRemove = ImageVector.Builder(
            name = "Outline.WalletRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 22.75f)
                horizontalLineTo(7.63f)
                curveTo(7.31f, 22.75f, 7.03f, 22.55f, 6.92f, 22.26f)
                curveTo(6.81f, 21.97f, 6.9f, 21.63f, 7.141f, 21.43f)
                curveTo(7.38f, 21.23f, 7.601f, 20.97f, 7.76f, 20.69f)
                curveTo(8.08f, 20.18f, 8.24f, 19.6f, 8.24f, 19.01f)
                curveTo(8.24f, 17.22f, 6.78f, 15.76f, 4.99f, 15.76f)
                curveTo(4.06f, 15.76f, 3.17f, 16.16f, 2.55f, 16.87f)
                curveTo(2.34f, 17.1f, 2.01f, 17.19f, 1.72f, 17.08f)
                curveTo(1.43f, 16.97f, 1.23f, 16.69f, 1.23f, 16.38f)
                verticalLineTo(12f)
                curveTo(1.23f, 8.92f, 3.131f, 6.69f, 6.081f, 6.32f)
                curveTo(6.351f, 6.28f, 6.66f, 6.25f, 6.98f, 6.25f)
                horizontalLineTo(16.98f)
                curveTo(17.221f, 6.25f, 17.531f, 6.26f, 17.851f, 6.31f)
                curveTo(20.801f, 6.65f, 22.73f, 8.89f, 22.73f, 12f)
                verticalLineTo(17f)
                curveTo(22.75f, 20.44f, 20.441f, 22.75f, 17f, 22.75f)
                close()
                moveTo(9.18f, 21.25f)
                horizontalLineTo(17f)
                curveTo(19.58f, 21.25f, 21.25f, 19.58f, 21.25f, 17f)
                verticalLineTo(12f)
                curveTo(21.25f, 9.66f, 19.881f, 8.05f, 17.66f, 7.79f)
                curveTo(17.42f, 7.75f, 17.211f, 7.75f, 17f, 7.75f)
                horizontalLineTo(7f)
                curveTo(6.76f, 7.75f, 6.53f, 7.77f, 6.3f, 7.8f)
                curveTo(4.1f, 8.08f, 2.75f, 9.68f, 2.75f, 12f)
                verticalLineTo(14.82f)
                curveTo(3.43f, 14.45f, 4.21f, 14.25f, 5f, 14.25f)
                curveTo(7.62f, 14.25f, 9.75f, 16.38f, 9.75f, 19f)
                curveTo(9.75f, 19.79f, 9.55f, 20.57f, 9.18f, 21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.19f, 7.81f)
                curveTo(5.95f, 7.81f, 5.73f, 7.7f, 5.58f, 7.5f)
                curveTo(5.41f, 7.27f, 5.39f, 6.97f, 5.52f, 6.72f)
                curveTo(5.69f, 6.38f, 5.93f, 6.05f, 6.24f, 5.75f)
                lineTo(9.49f, 2.49f)
                curveTo(11.15f, 0.84f, 13.85f, 0.84f, 15.51f, 2.49f)
                lineTo(17.26f, 4.27f)
                curveTo(18f, 5f, 18.45f, 5.98f, 18.5f, 7.02f)
                curveTo(18.51f, 7.25f, 18.42f, 7.47f, 18.25f, 7.62f)
                curveTo(18.08f, 7.77f, 17.85f, 7.84f, 17.63f, 7.8f)
                curveTo(17.43f, 7.77f, 17.22f, 7.76f, 17f, 7.76f)
                horizontalLineTo(7f)
                curveTo(6.76f, 7.76f, 6.53f, 7.78f, 6.3f, 7.81f)
                curveTo(6.27f, 7.81f, 6.23f, 7.81f, 6.19f, 7.81f)
                close()
                moveTo(7.86f, 6.25f)
                horizontalLineTo(16.82f)
                curveTo(16.69f, 5.91f, 16.48f, 5.6f, 16.2f, 5.32f)
                lineTo(14.44f, 3.54f)
                curveTo(13.37f, 2.48f, 11.62f, 2.48f, 10.54f, 3.54f)
                lineTo(7.86f, 6.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 17.25f)
                horizontalLineTo(19f)
                curveTo(17.48f, 17.25f, 16.25f, 16.02f, 16.25f, 14.5f)
                curveTo(16.25f, 12.98f, 17.48f, 11.75f, 19f, 11.75f)
                horizontalLineTo(22f)
                curveTo(22.41f, 11.75f, 22.75f, 12.09f, 22.75f, 12.5f)
                curveTo(22.75f, 12.91f, 22.41f, 13.25f, 22f, 13.25f)
                horizontalLineTo(19f)
                curveTo(18.31f, 13.25f, 17.75f, 13.81f, 17.75f, 14.5f)
                curveTo(17.75f, 15.19f, 18.31f, 15.75f, 19f, 15.75f)
                horizontalLineTo(22f)
                curveTo(22.41f, 15.75f, 22.75f, 16.09f, 22.75f, 16.5f)
                curveTo(22.75f, 16.91f, 22.41f, 17.25f, 22f, 17.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 23.75f)
                curveTo(3.34f, 23.75f, 1.78f, 22.87f, 0.94f, 21.44f)
                curveTo(0.49f, 20.72f, 0.25f, 19.87f, 0.25f, 19f)
                curveTo(0.25f, 17.85f, 0.67f, 16.74f, 1.44f, 15.87f)
                curveTo(2.34f, 14.84f, 3.64f, 14.25f, 5f, 14.25f)
                curveTo(7.62f, 14.25f, 9.75f, 16.38f, 9.75f, 19f)
                curveTo(9.75f, 19.87f, 9.51f, 20.72f, 9.06f, 21.45f)
                curveTo(8.81f, 21.87f, 8.49f, 22.25f, 8.11f, 22.57f)
                curveTo(7.28f, 23.33f, 6.17f, 23.75f, 5f, 23.75f)
                close()
                moveTo(5f, 15.75f)
                curveTo(4.07f, 15.75f, 3.18f, 16.15f, 2.56f, 16.86f)
                curveTo(2.04f, 17.46f, 1.75f, 18.22f, 1.75f, 19f)
                curveTo(1.75f, 19.59f, 1.91f, 20.17f, 2.22f, 20.67f)
                curveTo(2.8f, 21.65f, 3.87f, 22.25f, 5f, 22.25f)
                curveTo(5.79f, 22.25f, 6.55f, 21.96f, 7.13f, 21.44f)
                curveTo(7.39f, 21.22f, 7.61f, 20.96f, 7.77f, 20.68f)
                curveTo(8.09f, 20.17f, 8.25f, 19.59f, 8.25f, 19f)
                curveTo(8.25f, 17.21f, 6.79f, 15.75f, 5f, 15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.07f, 20.79f)
                curveTo(5.88f, 20.79f, 5.69f, 20.72f, 5.54f, 20.57f)
                lineTo(3.43f, 18.46f)
                curveTo(3.14f, 18.17f, 3.14f, 17.69f, 3.43f, 17.4f)
                curveTo(3.72f, 17.11f, 4.2f, 17.11f, 4.49f, 17.4f)
                lineTo(6.6f, 19.51f)
                curveTo(6.89f, 19.8f, 6.89f, 20.28f, 6.6f, 20.57f)
                curveTo(6.45f, 20.72f, 6.26f, 20.79f, 6.07f, 20.79f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.931f, 20.82f)
                curveTo(3.741f, 20.82f, 3.551f, 20.75f, 3.401f, 20.6f)
                curveTo(3.111f, 20.31f, 3.111f, 19.83f, 3.401f, 19.54f)
                lineTo(5.511f, 17.43f)
                curveTo(5.801f, 17.14f, 6.281f, 17.14f, 6.571f, 17.43f)
                curveTo(6.861f, 17.72f, 6.861f, 18.2f, 6.571f, 18.49f)
                lineTo(4.461f, 20.6f)
                curveTo(4.311f, 20.75f, 4.121f, 20.82f, 3.931f, 20.82f)
                close()
            }
        }.build()

        return _WalletRemove!!
    }

@Suppress("ObjectPropertyName")
private var _WalletRemove: ImageVector? = null
