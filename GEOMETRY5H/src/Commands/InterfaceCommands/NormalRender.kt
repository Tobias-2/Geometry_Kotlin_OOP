package Commands.InterfaceCommands
import Commands.Command
import UserInterface.InputReader
import Utilities.Canvas
import Utilities.Memory
import Visitors.Children.UsesCanvas.NormalRenderVisitor

class NormalRender(
    val canvas: Canvas,
    val memory: Memory,
    val visitor: NormalRenderVisitor,
    val input: InputReader
) : Command {
    override fun execute() {

        println()
        println("=========================================")
        println("              NORMAL RENDERING")
        println("=========================================")
        println()


        println("Please pick dimensions of your canvas dimensions, values 10 to 100.")
        println()

        var height: Int = 0
        var width: Int = 0

        while (height < 10 || height > 100) {
            height = input.readPositiveInt("Pick height of canvas: ")
            println()
        }

        while (width < 10 || width > 100) {
            width = input.readPositiveInt("Pick width of canvas: ")
            println()
        }

        visitor.newCanvasSize(height, width)

        for (shape in memory.allDrawableShapes) {
            shape.accept(visitor)
        }

        visitor.render()

        println()
        println("=========================================")
        println("              END OF RENDER")
        println("=========================================")
    }
}