class Menu (
    val input : InputReader
) {
    val commands = mutableMapOf<Int, Command>()
    val descriptions = mutableMapOf<Int, String>()

    fun register (
        number: Int,
        description: String,
        command: Command
    ) {
        commands[number] = command
        descriptions[number] = description
    }

    fun show() {
        println()
        println("========================================")
        println("===== GEOMETRIC FIGURE APPLICATION =====")
        println("========================================")

        descriptions.toSortedMap().forEach { number, description -> println("$number. $description") }

    }

    fun executeSelection( selection : Int ) {
        val command = commands[selection]

        if (command == null) {
            println("Unknown selection.")
            return
        }
        command.execute()
    }

    fun readSelection() : Int {
        return input.readInt("Selection: ")
    }


}