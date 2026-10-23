class DrawableLowerRightTriangle (
    positionX: Int,
    positionY: Int,
    height: Int,
    val character : Char = '$',
    val color : Color = Color.WHITE

) : LowerRightTriangle (positionX, positionY, height) {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}