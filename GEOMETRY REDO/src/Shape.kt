abstract class Shape (
        val positionX: Int,
        val positionY: Int
) {

    init {
        require(positionX >= 0) { "positionY cannot be negative: $positionX" }
        require(positionY >= 0) { "positionX cannot be negative: $positionY" }
    }

    abstract fun accept(visitor: Visitor)
}