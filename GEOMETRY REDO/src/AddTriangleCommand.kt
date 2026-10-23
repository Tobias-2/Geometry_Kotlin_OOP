abstract class AddTriangleCommand (
    val repository: ShapeCollector,
    val input: InputReader
) : Command {
    override fun execute() {

        val originX = input.readPositionX()
        val originY = input.readPositionY()
        val hei = input.readNonNegativeInt("Height of Triangle = ")
        val char = input.readCharacter("Triangle's printing character = ")
        val col = input.readColor("Triangle's color = ")

    }
}