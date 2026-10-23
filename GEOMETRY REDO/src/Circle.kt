open class Circle (
    positionX: Int,
    positionY: Int,
    val radius: Int,
) : Shape(positionX, positionY) {
    init {
        require(radius > 0) { "Diameter has to be a positive number" }
    }
    override fun accept(visitor: Visitor) {
    }
}