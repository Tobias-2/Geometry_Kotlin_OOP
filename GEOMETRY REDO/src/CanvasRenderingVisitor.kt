abstract class CanvasRenderingVisitor (
    val figures : List<Shape>
) : Visitor {

    //protected lateinit var canvas : Array<CharArray>

    // Setting base array
    var canvas = Array(20) {
        CharArray(20) {' '}
    }

    fun put (x : Int, y : Int, character: Char) {
        if (
            y in canvas.indices &&
            x in canvas.indices
        )
            canvas[y][x] = character
    }

    val baseColor = Color.WHITE

    var colorCanvas = Array(20) {
        Array(20) {baseColor}
    }

    fun putColored(
        x: Int,
        y: Int,
        character: Char,
        color: Color
    ) {
        if (
            y in canvas.indices &&
            x in canvas[y].indices
        ) {
            canvas[y][x] = character
            colorCanvas[y][x] = color
        }
    }

    abstract fun render()

}

