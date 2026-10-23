class Application {
    var running = true

    val repository = ShapeCollector()
    val input = InputReader()
    val menu = Menu(input)

    init {
        registerCommands()
    }

    fun run() {
        while (running) {
            menu.show()
            val selection = menu.readSelection()
            menu.executeSelection(selection)
        }
        println( "Application closed!" )
    }

    fun stop() {
        running = false
    }

    fun registerCommands() {

        menu.register(
            1,
            "Add Rectangle",
            AddRectangleCommand(repository, input)
        )

        menu.register(
            2,
            "Add Circle",
            AddCircleCommand(repository, input)
        )

        menu.register(
            3,
            "Add Upper Right Triangle",
            AddUpperRightTriangleCommand(repository, input)
        )

        menu.register(
            4,
            "Add Upper Left Triangle",
            AddUpperLeftTriangleCommand(repository, input)
        )

        menu.register(
            5,
            "Add Lower Right Triangle",
            AddLowerRightTriangleCommand(repository, input)
        )

        menu.register(
            6,
            "Add Lower Left Triangle",
            AddLowerLeftTriangleCommand(repository, input)
        )

        menu.register(
            7,
            "Normal Rendering",
            NormalRenderCommand(repository)
        )

        menu.register(
            8,
            "Colorful Rendering",
            ColorRenderingCommand(repository)
        )

        menu.register(
            9,
            "Render a list",
            ListRenderingCommand(repository)
        )

        menu.register(
            0,
            "Exit",
            ExitCommand(this)
        )
    }

}