package Visitors.Children
import Shapes.Drawable.Children.DrawableCircle
import Shapes.Drawable.Children.DrawableRectangle
import Shapes.Drawable.Children.Triangles.UpperRightTriangle
import Utilities.Canvas
import Visitors.ShapeVisitor
abstract class CanvasRenderingVisitor (
    val canvas: Canvas
) : ShapeVisitor () {

    override fun visit(shape: DrawableRectangle) {

        val x = shape.shape.point.x
        val y = shape.shape.point.y
        val height = shape.shape.height
        val width = shape.shape.bottom
        val character = shape.visuals.character

        for (j in 1..height) {
            for (i in 1..width) {
                canvas.putInCanvas(j + y-1,i + x-1,character)
            }
        }
    }

    override fun visit(shape: DrawableCircle) {

    }
    override fun visit(shape: UpperRightTriangle) {

    }

}