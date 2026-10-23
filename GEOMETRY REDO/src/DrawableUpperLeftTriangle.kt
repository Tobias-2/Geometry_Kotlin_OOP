class DrawableUpperLeftTriangle (

    positionX: Int,
    positionY: Int,
    height: Int,
    val character : Char = '$',
    val color : Color = Color.WHITE

) : UpperLeftTriangle (positionX, positionY, height) {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}