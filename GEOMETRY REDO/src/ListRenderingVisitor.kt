class ListRenderingVisitor (

) :  Visitor {

    override fun visit(circle: DrawableCircle) {
        println(
            "Type: Circle\n" +
                    "|\tRadius: ${circle.radius}\t|" +
                    "\tPosition X: ${circle.positionX}\t|" +
                    "\tPosition Y: ${circle.positionY}\t|" +
                    "\tColor: ${circle.color}\t|" +
                    "\tCharacter: ${circle.character}\t|" +
                    "\n"
        )
    }

    override fun visit(rectangle: DrawableRectangle) {
        println(
            "Type: Rectangle" +
                    "Height: ${rectangle.height}" +
                    "Width: ${rectangle.width}" +
                    "Position X: ${rectangle.positionX}" +
                    "Position Y: ${rectangle.positionY}" +
                    "Color: ${rectangle.color}" +
                    "Character: ${rectangle.character}"
        )

    }

    override fun visit(triangle: DrawableUpperLeftTriangle) {
        println(
            "Type: UpperLeftTriangle" +
                    "Height: ${triangle.height}" +
                    "Position X: ${triangle.positionX}" +
                    "Position Y: ${triangle.positionY}" +
                    "Color: ${triangle.color}" +
                    "Character: ${triangle.character}"
        )
    }

    override fun visit(triangle: DrawableUpperRightTriangle) {
        println(
            "Type: UpperRightTriangle" +
                    "Height: ${triangle.height}" +
                    "Position X: ${triangle.positionX}" +
                    "Position Y: ${triangle.positionY}" +
                    "Color: ${triangle.color}" +
                    "Character: ${triangle.character}"
        )
    }

    override fun visit(triangle: DrawableLowerLeftTriangle) {
        println(
            "Type: LowerLeftTriangle" +
                    "Height: ${triangle.height}" +
                    "Position X: ${triangle.positionX}" +
                    "Position Y: ${triangle.positionY}" +
                    "Color: ${triangle.color}" +
                    "Character: ${triangle.character}"
        )
    }

    override fun visit(triangle: DrawableLowerRightTriangle) {
        println(
            "Type: LowerRightTriangle" +
                    "Height: ${triangle.height}" +
                    "Position X: ${triangle.positionX}" +
                    "Position Y: ${triangle.positionY}" +
                    "Color: ${triangle.color}" +
                    "Character: ${triangle.character}"
        )
    }

}