package Shapes.Drawable.Parent

import Shapes.Shape
import Utilities.Point
import Utilities.Visuals
import Visitors.ShapeVisitor

abstract class DrawableShape(
    val visuals: Visuals,
) : Shape() {
    open fun accept(visitor: ShapeVisitor) {}
}