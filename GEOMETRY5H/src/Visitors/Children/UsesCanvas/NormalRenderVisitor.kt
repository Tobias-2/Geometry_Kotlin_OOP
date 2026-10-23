package Visitors.Children.UsesCanvas

import Shapes.Drawable.Children.DrawableCircle
import Shapes.Drawable.Children.DrawableRectangle
import Shapes.Drawable.Children.Triangles.UpperRightTriangle
import Visitors.Children.CanvasRenderingVisitor
import Utilities.Canvas

class NormalRenderVisitor(
    canvas: Canvas
) : CanvasRenderingVisitor (canvas) {

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

    fun render() {
        canvas.printNormalCanvas()
    }

    fun newCanvasSize(height: Int, width: Int) {
        canvas.height = height
        canvas.width = width

        canvas.board = Array(height) {
            CharArray(width) {'.'}
        }
    }

}