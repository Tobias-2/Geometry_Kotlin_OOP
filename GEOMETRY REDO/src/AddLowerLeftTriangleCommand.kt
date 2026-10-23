class AddLowerLeftTriangleCommand  (
    repository: ShapeCollector,
    input: InputReader
) : AddTriangleCommand (repository, input) {
    override fun execute() {

        val originX = input.readPositionX()
        val originY = input.readPositionY()
        val hei = input.readNonNegativeInt("Height of Triangle = ")
        val char = input.readCharacter("Triangle's printing character = ")
        val col = input.readColor("Triangle's color = ")


        val triangle = DrawableLowerLeftTriangle(
            originX,
            originY,
            hei,
            char,
            col
        )

        repository.addShape(triangle)
    }
}
