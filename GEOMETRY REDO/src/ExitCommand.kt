class ExitCommand (
    val application : Application
) : Command {
    override fun execute() {
        application.stop()
    }
}