package Visitors

import Shapes.Drawable.Children.DrawableCircle
import Shapes.Drawable.Children.DrawableRectangle
import Shapes.Drawable.Children.Triangles.UpperRightTriangle

abstract class ShapeVisitor {
    open fun visit(shape: DrawableRectangle) {}
    open fun visit(shape: DrawableCircle) {}
    open fun visit(shape: UpperRightTriangle) {}
}