class ListRenderingCommand (
    val repository : ShapeCollector
): Command {
    override fun execute() {

        println()
        println("==================================================================================================")
        println("================================== YOUR === SHAPES === LIST ======================================")
        println("==================================================================================================")
        println()

        val figures = repository.allShapes

        if (figures.isEmpty()) {
            println("There are no figures to print on the list!")
            return
        }

        val visitor = ListRenderingVisitor()

        for (figure in repository.getAll()) {
            figure.accept(visitor)
        }

        println("==================================================================================================")
    }
}