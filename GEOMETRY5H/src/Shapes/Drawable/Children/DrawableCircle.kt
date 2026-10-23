package Shapes.Drawable.Children

import Shapes.Drawable.Parent.DrawableShape
import Shapes.NotDrawable.Children.Circle
import Utilities.Point
import Utilities.Visuals
import Visitors.ShapeVisitor

class DrawableCircle (
    visuals: Visuals,
    val shape: Circle
) : DrawableShape(
    visuals
) {
    override fun accept(visitor: ShapeVisitor) {
        visitor.visit(this)
    }
}