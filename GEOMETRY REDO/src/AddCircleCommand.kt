class AddCircleCommand (
    val repository: ShapeCollector,
    val input: InputReader
) : Command {
    override fun execute() {

        val originX = input.readPositionX()
        val originY = input.readPositionY()
        val rad = input.readNonNegativeInt("Radius of this Circle = ")
        val char = input.readCharacter("Circle's printing character = ")
        val col = input.readColor("Circle's color = ")

        val circle = DrawableCircle(
            originX,
            originY,
            rad,
            char,
            col
        )

        repository.addShape(circle)
    }
}