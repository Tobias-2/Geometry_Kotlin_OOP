class DrawableRectangle (
    positionX: Int,
    positionY: Int,
    height: Int,
    width: Int,
    val character : Char = '$',
    val color : Color = Color.WHITE

) : Rectangle (positionX, positionY, height, width) {

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}