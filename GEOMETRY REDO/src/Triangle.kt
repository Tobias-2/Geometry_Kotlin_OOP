abstract class Triangle(
    positionX: Int,
    positionY: Int,
    val height: Int,
) : Shape(positionX, positionY) {
    init {
        require(height > 0) { "Height must be a positive number" }
    }
}