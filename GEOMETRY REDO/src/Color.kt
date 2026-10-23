enum class Color(val ansiCode: String) {
    WHITE("\u001B[37m"),
    CYAN("\u001B[36m"),
    MAGENTA("\u001B[35m"),
    YELLOW("\u001B[33m");

    companion object {
        const val RESET = "\u001B[0m"
    }
}

