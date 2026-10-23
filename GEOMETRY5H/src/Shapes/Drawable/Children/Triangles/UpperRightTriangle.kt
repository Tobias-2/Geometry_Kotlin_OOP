package Shapes.Drawable.Children.Triangles
import Shapes.Drawable.Children.DrawableTriangle
import Utilities.Point
import Utilities.Visuals
import Shapes.NotDrawable.Children.Triangles.UpperRightTriangle
import Visitors.ShapeVisitor

class UpperRightTriangle(
    visuals: Visuals,
    val shape: UpperRightTriangle
) : DrawableTriangle (
    visuals
) {
    override fun accept(visitor: ShapeVisitor) {
        visitor.visit(this)
    }
}