package Shapes.NotDrawable.Parent

import Shapes.Shape
import Utilities.Point

abstract class NotDrawableShape (
    val point: Point
) : Shape() {}