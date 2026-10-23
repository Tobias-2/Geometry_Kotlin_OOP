open class LowerLeftTriangle (
    positionX: Int,
    positionY: Int,
    height: Int,
) : Triangle (
    positionX,
    positionY,
    height,
) {
    override fun accept(visitor: Visitor) {
    }
}