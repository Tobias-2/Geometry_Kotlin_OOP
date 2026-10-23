package Shapes.NotDrawable.Children
import Shapes.NotDrawable.Parent.NotDrawableShape

import Utilities.Point

abstract class Triangle (
    point: Point,
    val height: Int
) : NotDrawableShape(point) {
    init {
        require(height > 0) {
            "Height must be bigger than zero"
        }
    }
}