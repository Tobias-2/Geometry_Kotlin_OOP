package UserInterface

class InputReader {

    fun readPositiveInt(message: String): Int {

        print("$message ")

        while (true) {

            val value = readln().toInt()

            if (value <= 0) {
                print("Please pick positive integer: ")
            } else {
                return value
            }

        }

    }

    fun readShapeType() : String {

        print("Shape of choice: ")

        val possibleChoices: Set<String> = setOf("R", "T", "C")

        while (true) {
            val value = readln()

            if (value in possibleChoices) {
                return value
            }

            print("Please choose R or T or S")
        }
    }

    fun read1to4(): Int {

        print("Please pick number between 1 to 4: ")

        while (true) {
            val value = readln().toInt()

            if (value in 1..4) {
                return value
            }

            print("Value 1-4: ")
        }

    }

    fun readColor() : String {
        print("Color of choice: ")

        val possibleChoices: Set<String> = setOf("R", "B", "Y")

        while (true) {
            val value = readln()

            if (value in possibleChoices) {
                return value
            }

            print("Choose one R or B or Y: ")
        }
    }

    fun readCharacter() : Char {

        print("Please pick character: ")

        while (true) {

            val value = readln().trim()

            if (value.length == 1) {
                return value.first()
            }

            print("Choose one Char: ")
        }

    }

    fun read1to5(): Int {

        print("Please pick number between 1 to 5: ")

        while (true) {
            val value = readln().toInt()

            if (value in 1..5) {
                return value
            }

            print("Value 1 - 5: ")
        }

    }
}