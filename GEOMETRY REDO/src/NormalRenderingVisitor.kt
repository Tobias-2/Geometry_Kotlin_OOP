class NormalRenderingVisitor (
    figures : MutableList<Shape>
) : CanvasRenderingVisitor(figures) {


    override fun visit(circle: DrawableCircle) {
        val radius = circle.radius
        val char = circle.character
        val positionX = circle.positionX
        val positionY = circle.positionY

        val diameter = radius * 2
        var countUp = 0
        var countDown = 0
        var countOfIterations = 0
        var countDown2 = diameter * 2 + 2
        var countUp2 = radius

        for (row in 0 until diameter) {
            countUp += 2
            countDown--
            countOfIterations++
            countDown2 -= 2
            countUp2++
            if (countOfIterations <= radius) {
                for (column in 0 until countUp) {
                    put(
                        positionX + column + radius + countDown,
                        positionY + row,
                        char
                    )
                }
            } else {
                for (column in 0 until countDown2) {
                    put(
                        positionX + column + countUp2 - diameter - 1,
                        positionY + row,
                        char
                    )
                }
            }
        }
    }


    override fun visit(rectangle: DrawableRectangle) {
        val height = rectangle.height
        val width = rectangle.width
        val char = rectangle.character
        val positionX = rectangle.positionX
        val positionY = rectangle.positionY

        for ( row in 0 until height) {
            for ( column in 0 until width ) {
                put(
                    column + positionX,
                    row + positionY,
                    char
                )
            }
        }
    }


    override fun visit(triangle: DrawableUpperLeftTriangle) {
        val height = triangle.height
        val char = triangle.character
        val positionX = triangle.positionX
        val positionY = triangle.positionY

        for ( row in 0 until height ) {
            for (column in 0 .. row) {
                put(
                    column + positionX,
                    row + positionY,
                    char
                )
            }
        }
    }

    override fun visit(triangle: DrawableUpperRightTriangle) {
        val height = triangle.height
        val char = triangle.character
        val positionX = triangle.positionX
        val positionY = triangle.positionY

        for ( row in 0 until height ) {
            for (column in 0 .. row)
                put(
                    column + positionX - row + height - 2,
                    row + positionY - 1,
                    char
                )
        }

    }

    override fun visit(triangle: DrawableLowerLeftTriangle) {
        val height = triangle.height
        val char = triangle.character
        val positionX = triangle.positionX
        val positionY = triangle.positionY

        var count = height
        for (row in 0 until height) {
            count--
            for (column in 0..count) {
                put(
                    column + positionX - 1,
                    row + positionY - 1,
                    char
                )
            }
        }

    }



    override fun visit(triangle: DrawableLowerRightTriangle) {
        val height = triangle.height
        val char = triangle.character
        val positionX = triangle.positionX
        val positionY = triangle.positionY

        var countDown = height
        var countUp = 0
        for (row in 0 until height) {
            countDown--
            countUp++
            for (column in 0..countDown) {
                put(
                    column + positionX + countUp - 2,
                    row + positionY - 1,
                    char
                )
            }
        }
    }

    override fun render() {
        figures.forEach { figure ->
            figure.accept(this)
        }

        canvas.forEach { row ->
            println(row.concatToString())
        }
    }
}