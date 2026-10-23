package Commands.InterfaceCommands
import Commands.Command
import Shapes.Drawable.Children.DrawableRectangle
import Utilities.Memory
import Visitors.Children.ListPrintVisitor
import Shapes.Drawable.Children.*


class ListPrint(
    val listPrintVisitor: ListPrintVisitor,
    val memory: Memory
) : Command {
    override fun execute() {

        println()
        println("=========================================")
        println("              LIST PRINT")
        println("=========================================")

        var count = 0

        for (shape in memory.allDrawableShapes) {
            println()
            count++
            println("Shape number: $count")
            shape.accept(listPrintVisitor)
        }

        println()
        println("=========================================")
        println("              END OF LIST")
        println("=========================================")
    }
}