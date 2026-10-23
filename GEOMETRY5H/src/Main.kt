//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Commands.InterfaceCommands.AddShape
import Commands.InterfaceCommands.Exit
import Commands.InterfaceCommands.ListPrint
import Shapes.NotDrawable.Children.Circle
import UserInterface.*
import UserInterface.MenuMessages.AddShapeMessages
import UserInterface.MenuMessages.InterfaceMessages
import Utilities.Canvas
import Utilities.Memory
import Utilities.Point
import Utilities.Status
import Visitors.Children.ListPrintVisitor
import Visitors.Children.UsesCanvas.NormalRenderVisitor

fun main() {

    val inputReader = InputReader()
    val addShapeMessages = AddShapeMessages()
    val memory = Memory()
    val status = Status()
    val interfaceMessages = InterfaceMessages()
    val listPrintVisitor = ListPrintVisitor()
    val canvas = Canvas()
    val normalRenderVisitor = NormalRenderVisitor(canvas)

    Interface(interfaceMessages, addShapeMessages, inputReader, status, memory, listPrintVisitor, canvas, normalRenderVisitor).run()

}