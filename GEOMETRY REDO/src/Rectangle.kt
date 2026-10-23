open class Rectangle(
    positionX: Int,
    positionY: Int,
    val height: Int,
    val width: Int
) : Shape(positionX, positionY) {
    init {
        require( height > 0) { "Height mus be a positive number" }
        require( width > 0) { "Height mus be a positive number" }
    }

    override fun accept(visitor: Visitor)
    {
    }
}