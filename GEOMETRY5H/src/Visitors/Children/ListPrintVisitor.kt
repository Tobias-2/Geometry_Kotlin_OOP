package Visitors.Children
import Shapes.Drawable.Children.DrawableCircle
import Shapes.Drawable.Children.DrawableRectangle
import Shapes.Drawable.Children.Triangles.UpperRightTriangle
import Visitors.ShapeVisitor
import Utilities.Memory


class ListPrintVisitor() : ShapeVisitor() {

    override fun visit(shape: DrawableRectangle) {
        println("Rectangle: ")
        println("position = [x: ${shape.shape.point.x} & y: ${shape.shape.point.y}]")
        println("dimensions = [height: ${shape.shape.height} & bottom: ${shape.shape.bottom}]")
        println("visuals = [character: '${shape.visuals.character}' & color: ${shape.visuals.color}]")
    }
    override fun visit(shape: DrawableCircle) {
        println("Rectangle: ")
        println("position = [x: ${shape.shape.point.x} & y: ${shape.shape.point.y}]")
        println("dimensions = [radius: ${shape.shape.radius}]")
        println("visuals = [character: '${shape.visuals.character}' & color: ${shape.visuals.color}]")
    }
    override fun visit(shape: UpperRightTriangle) {
        println("Rectangle: " )
        println("position = [x: ${shape.shape.point.x} & y: ${shape.shape.point.y}]")
        println("dimensions = [height: ${shape.shape.height}]" )
        println("visuals = [character: '${shape.visuals.character}' & color: ${shape.visuals.color}]")
    }
}