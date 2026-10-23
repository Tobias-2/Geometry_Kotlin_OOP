package Shapes.Drawable.Children

import Shapes.Drawable.Parent.DrawableShape
import Shapes.Shape
import Utilities.Point
import Utilities.Visuals
import Visitors.ShapeVisitor

abstract class DrawableTriangle (
    visuals: Visuals,
) : DrawableShape(
    visuals
) {
}