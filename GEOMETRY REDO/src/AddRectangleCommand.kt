class AddRectangleCommand (
    val repository: ShapeCollector,
    val input: InputReader
) : Command {
    override fun execute() {

        val originX = input.readPositionX()
        val originY = input.readPositionY()
        val wid = input.readNonNegativeInt("Width of Rectangle = ")
        val hei = input.readNonNegativeInt("Height of Rectangle = ")
        val char = input.readCharacter("Rectangle's printing character = ")
        val col = input.readColor("Rectangle's color = ")

        val rectangle = DrawableRectangle(
            originX,
            originY,
            hei,
            wid,
            char,
            col
        )

        repository.addShape(rectangle)
    }
}