package Shapes.NotDrawable.Children

import Utilities.Point
import Shapes.NotDrawable.Parent.NotDrawableShape

class Circle (
    point: Point,
    val radius: Int
) : NotDrawableShape(point) {
    init {
        require(radius >= 0) {"Radius must be bigger than zero"}
    }
}