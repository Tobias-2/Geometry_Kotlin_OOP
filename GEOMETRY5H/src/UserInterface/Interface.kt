package UserInterface
import Commands.InterfaceCommands.AddShape
import Commands.InterfaceCommands.Exit
import Commands.InterfaceCommands.ListPrint
import Commands.InterfaceCommands.NormalRender
import UserInterface.MenuMessages.AddShapeMessages
import UserInterface.MenuMessages.InterfaceMessages
import Utilities.Canvas
import Utilities.Memory
import Utilities.Status
import Visitors.Children.ListPrintVisitor
import Visitors.Children.UsesCanvas.NormalRenderVisitor

class Interface (
    val message: InterfaceMessages,
    val messagesAdd: AddShapeMessages,
    val input: InputReader,
    val status: Status,
    val memory: Memory,
    val listPrintVisitor: ListPrintVisitor,
    val canvas: Canvas,
    val normalRenderVisitor: NormalRenderVisitor
) {

    fun run() {
        message.start()

        while (status.programRuns) {
            message.options()
            val choice = input.read1to5()
            when (choice) {
                1 -> AddShape(input,messagesAdd,memory).execute()
                2 -> NormalRender(canvas, memory, normalRenderVisitor, input).execute()
                3 -> continue
                4 -> ListPrint(listPrintVisitor, memory).execute()
                5 -> Exit(status).execute()
            }
        }


        message.end()
    }

}