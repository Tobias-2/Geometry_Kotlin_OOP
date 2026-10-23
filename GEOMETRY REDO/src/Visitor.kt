interface Visitor {

    fun visit(circle: DrawableCircle) : Unit

    fun visit(rectangle: DrawableRectangle) : Unit

    fun visit(triangle: DrawableUpperLeftTriangle) : Unit

    fun visit(triangle: DrawableUpperRightTriangle) : Unit

    fun visit(triangle: DrawableLowerLeftTriangle) : Unit

    fun visit(triangle: DrawableLowerRightTriangle) : Unit

}