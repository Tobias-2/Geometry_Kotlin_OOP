package Shapes.Drawable.Children

import Shapes.Drawable.Parent.DrawableShape
import Shapes.NotDrawable.Children.*
import Utilities.Point
import Utilities.Visuals
import Visitors.ShapeVisitor

class DrawableRectangle (
    visuals: Visuals,
    val shape: Rectangle
) : DrawableShape(
    visuals
) {
    override fun accept(visitor: ShapeVisitor) {
        visitor.visit(this)
    }
}