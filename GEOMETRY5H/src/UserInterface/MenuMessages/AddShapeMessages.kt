package UserInterface.MenuMessages

class AddShapeMessages {

    fun pickX() {
        println("Please choose X orientation for your shape")
    }

    fun pickY() {
        println("Please choose Y orientation for your shape")
    }


    fun pickShapeType() {
        println("Pick one shape from:")
        println("R -> Rectangle")
        println("T -> Triangle")
        println("C -> Circle")
    }

    fun pickTriangleType() {
        println("Please pick triangle type:")
        println("1 -> Upper Right Triangle")
    }

    fun pickColor() {
        println("Please pick a color:")
        println("R -> RED")
        println("B -> BLUE")
        println("Y -> YELLOW")
    }

    fun pickChar(){
        println("Please pick Char")
        println("It has to be one symbol with which this shape will be printed")
    }
}