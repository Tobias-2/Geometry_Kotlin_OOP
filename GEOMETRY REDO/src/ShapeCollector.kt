class ShapeCollector (

    val allShapes: MutableList<Shape> = mutableListOf<Shape>(),

) {

    fun addShape(figure : Shape) : Unit {
        allShapes.add(figure)
    }


    fun getAll() : MutableList<Shape> {
        return allShapes
    }


    fun isEmpty(): Boolean {
        return allShapes.isEmpty()
    }

    fun clear(): Unit {
        allShapes.clear()
    }


    // do I need it?
    fun accept(visitor: Visitor) : Unit {
    }

}