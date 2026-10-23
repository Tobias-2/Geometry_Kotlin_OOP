package Utilities

open class Canvas {

    var height = 20
    var width = 20

    init {
        require(height > 9) {" Height must be at least 10"}
        require(width > 9) {" Width must be at least 10"}
    }

    var board = Array(height) {
        CharArray(width) {'.'}
    }

    fun putInCanvas(x: Int, y:  Int, chracter: Char) {

        if (x in 0..board.size && y in 0..board[1].size) {
            board[y-1][x-1] = chracter
        }
    }

    val baseColor = Color.YELLOW

    var coloredBoard = Array(20) {
        Array(20) {baseColor}
    }

    fun putColoredInCanvas(x: Int, y:  Int, chracter: Char, color: Color) {

        if (x in 0..board.size && y in 0..board[1].size) {
            board[y-1][x-1] = chracter
            coloredBoard[y-1][x-1] = color
        }

    }

    fun printNormalCanvas() {
        for (row in board) {
            println(row)
        }
    }

    fun printColoredCanvas() {
        for (row in coloredBoard) {
            println(row)
        }
    }
}
