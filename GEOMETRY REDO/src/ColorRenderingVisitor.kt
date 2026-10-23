class ColorRenderingVisitor (
    figures : List<Shape>
) : CanvasRenderingVisitor(figures) {

    override fun visit(circle: DrawableCircle) {
        val radius = circle.radius
        val char = circle.character
        val positionX = circle.positionX
        val positionY = circle.positionY
        val color = circle.color

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
                    putColored(
                        positionX + column + radius + countDown,
                        positionY + row,
                        char,
                        color
                    )
                }
            } else {
                for (column in 0 until countDown2) {
                    putColored(
                        positionX + column + countUp2 - diameter - 1,
                        positionY + row,
                        char,
                        color
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
        val color = rectangle.color

        for ( row in 0 until height) {
            for ( column in 0 until width ) {
                putColored(
                    column + positionX,
                    row + positionY,
                    char,
                    color
                )
            }
        }
    }


    override fun visit(triangle: DrawableUpperLeftTriangle) {
        val height = triangle.height
        val char = triangle.character
        val positionX = triangle.positionX
        val positionY = triangle.positionY
        val color = triangle.color

        for ( row in 0 until height ) {
            for (column in 0 .. row) {
                putColored(
                    column + positionX,
                    row + positionY,
                    char,
                    color
                )
            }
        }
    }

    override fun visit(triangle: DrawableUpperRightTriangle) {
        val height = triangle.height
        val char = triangle.character
        val positionX = triangle.positionX
        val positionY = triangle.positionY
        val color = triangle.color

        for ( row in 0 until height ) {
            for (column in 0..row) {
                putColored(
                    column + positionX - row + height - 2,
                    row + positionY - 1,
                    char,
                    color
                )
            }
        }

    }

    override fun visit(triangle: DrawableLowerLeftTriangle) {
        val height = triangle.height
        val char = triangle.character
        val positionX = triangle.positionX
        val positionY = triangle.positionY
        val color = triangle.color

        var count = height
        for (row in 0 until height) {
            count--
            for (column in 0..count) {
                putColored(
                    column + positionX - 1,
                    row + positionY - 1,
                    char,
                    color
                )
            }
        }

    }



    override fun visit(triangle: DrawableLowerRightTriangle) {
        val height = triangle.height
        val char = triangle.character
        val positionX = triangle.positionX
        val positionY = triangle.positionY
        val color = triangle.color

        var countDown = height
        var countUp = 0
        for (row in 0 until height) {
            countDown--
            countUp++
            for (column in 0..countDown) {
                putColored(
                    column + positionX + countUp - 2,
                    row + positionY - 1,
                    char,
                    color
                )
            }
        }
    }

    override fun render() {
        figures.forEach { figure ->
            figure.accept(this)
        }

        canvas.indices.forEach { y ->
            canvas[y].indices.forEach { x ->
                val character = canvas[y][x]
                val color = colorCanvas[y][x]

                if (color != null) {
                    print(color.ansiCode)
                    print(character)
                    print(Color.RESET)
                } else {
                    print(character)
                }
            }

            println()
        }
    }

}