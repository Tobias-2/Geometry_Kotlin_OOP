class NormalRenderCommand (
    val repository : ShapeCollector
): Command {
    override fun execute() {
        val figures = repository.allShapes

        if (figures.isEmpty()) {
            println("There are no figures to print!")
            return
        }

        val visitor = NormalRenderingVisitor(repository.getAll())

        visitor.render()
    }
}