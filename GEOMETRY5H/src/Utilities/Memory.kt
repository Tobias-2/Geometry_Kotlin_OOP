package Utilities

import Shapes.Drawable.Parent.DrawableShape
import Shapes.NotDrawable.Parent.NotDrawableShape
import Visitors.ShapeVisitor

class Memory {

    val allNotDrawableShapes = mutableListOf<NotDrawableShape>()
    val allDrawableShapes = mutableListOf<DrawableShape>()

}