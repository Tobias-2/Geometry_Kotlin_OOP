class InputReader {

    fun readInt(prompt : String) : Int {
        while (true) {
            print(prompt)

            val value = readlnOrNull()
                ?.trim()
                ?.toIntOrNull()

            if (value != null) {
                return value
            }

            println("Please enter a valid integer.")
        }
    }

    fun readPositiveInt(prompt: String) : Int {

        while (true) {

            val value = readInt(prompt)

            if (value > 0) {
                return value
            }

            println("Please enter a positive integer.")

        }
    }

    fun readCharacter(prompt: String) : Char {
        while (true) {
            print(prompt)

            val value  = readlnOrNull()?.trim()

            if (!value.isNullOrEmpty()) {
                return value.first()
            }
        }
    }

    fun readNonNegativeInt( prompt: String ) : Int {
        while (true) {
            val value = readInt(prompt)

            if (value >= 0) {
                return value
            }
            println( "The number must not be negative" )
        }
    }

    fun readPosition() : Pair< Int, Int > {
        val x = readNonNegativeInt("Origin X = ")
        val y = readNonNegativeInt("Origin Y = ")
        return x to y
    }

    fun readPositionX() : Int {
        val x = readNonNegativeInt("Origin X = ")
        return x
    }

    fun readPositionY() : Int {
        val y = readNonNegativeInt("Origin Y = ")
        return y
    }


    fun readColor(prompt: String) : Color {

        while (true) {

            println(Color.entries.joinToString())

            print(prompt)

            val value = readlnOrNull()
                ?.trim()
                ?.uppercase()

            val color = Color.entries.find {
                it.name == value
            }

            if (color != null) {
                return color
            }

            println("Enter a valid color.")
        }
    }


}