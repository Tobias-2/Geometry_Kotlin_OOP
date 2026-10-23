package Commands.InterfaceCommands

import Commands.Command
import Shapes.Drawable.Children.DrawableCircle
import Shapes.Drawable.Children.DrawableRectangle
import Shapes.NotDrawable.Children.Circle
import Shapes.NotDrawable.Children.Rectangle
import Shapes.NotDrawable.Children.Triangles.UpperRightTriangle
import UserInterface.InputReader
import UserInterface.MenuMessages.AddShapeMessages
import Utilities.Color
import Utilities.Memory
import Utilities.Point
import Utilities.Visuals

class AddShape(
    val input: InputReader,
    val message: AddShapeMessages,
    val memory: Memory
) : Command {
    override fun execute() {

        message.pickShapeType()
        val shapeType = input.readShapeType()

        var triangleType = 1

        if (shapeType == "T") {
            message.pickTriangleType()
            triangleType = input.read1to4()
        }

        message.pickX()
        val x = input.readPositiveInt("X position of choice: ")

        message.pickY()
        val y = input.readPositiveInt("Y position of choice: ")

        val point = Point(x, y)

        message.pickColor()
        val colorLetter = input.readColor()

        var color: Color = Color.RED // just for init

        when (colorLetter) {
            "R" -> {
                color = Color.RED
            }
            "B" -> {
                color = Color.BLUE
            }
            "Y" -> {
                color = Color.YELLOW
            }
        }

        message.pickChar()
        val character = input.readCharacter()

        val visuals = Visuals(color, character)


        when (shapeType) {

            "R" -> {
                val height = input.readPositiveInt("Height of your rectangle: ")
                val bottom = input.readPositiveInt("Bottom of your rectangle: ")
                val shape = Rectangle(point, height, bottom)
                memory.allNotDrawableShapes.add(shape)
                val drawableShape = DrawableRectangle(visuals, shape)
                memory.allDrawableShapes.add(drawableShape)
            }

            "C" -> {
                val radius = input.readPositiveInt("Radius of your circle: ")
                val shape = Circle(point, radius)
                memory.allNotDrawableShapes.add(shape)
                val drawableShape = DrawableCircle(visuals, shape)
                memory.allDrawableShapes.add(drawableShape)
            }

            "T" -> {
                when (triangleType) {
                    1 -> {
                        val height = input.readPositiveInt("Height of your triangle: ")
                        val shape = UpperRightTriangle(point, height)
                        memory.allNotDrawableShapes.add(shape)
                        val drawableShape = Shapes.Drawable.Children.Triangles.UpperRightTriangle(visuals, shape)
                        memory.allDrawableShapes.add(drawableShape)
                    }
                }
            }
        }
        println("Shape added!")
    }
}