class DrawableCircle (
    positionX: Int,
    positionY: Int,
    radius: Int,
    val character : Char = '$',
    val color : Color = Color.WHITE

) : Circle (positionX, positionY, radius) {

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }

}