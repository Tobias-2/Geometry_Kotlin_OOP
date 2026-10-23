package Shapes.NotDrawable.Children
import Shapes.NotDrawable.Parent.NotDrawableShape

import Utilities.Point

class Rectangle(
    point: Point,
    val height: Int,
    val bottom: Int
) : NotDrawableShape(point) {
    init {
        require(height > 0) {"Height must be bigger than zero"}
        require(bottom > 0) {"Bottom must be bigger than zero"}
    }
}