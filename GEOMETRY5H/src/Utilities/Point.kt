package Utilities

data class Point(val x: Int, val y: Int) {
    init {
        require(x > 0) {"x too small"}
        require(y > 0) {"y too small"}
    }
}