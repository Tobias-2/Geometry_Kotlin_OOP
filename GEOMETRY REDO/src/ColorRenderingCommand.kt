class ColorRenderingCommand (
    val repository : ShapeCollector
): Command {
    override fun execute() {
        val figures = repository.allShapes

        if (figures.isEmpty()) {
            println("There are no figures to print!")
            return
        }

        val visitor = ColorRenderingVisitor(repository.getAll())

        visitor.render()
    }
}