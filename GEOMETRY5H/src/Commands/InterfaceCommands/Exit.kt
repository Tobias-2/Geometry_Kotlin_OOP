package Commands.InterfaceCommands

import Commands.Command
import Utilities.Status

class Exit (
    val status: Status
) : Command {

    override fun execute() {
        status.stop()
    }

}