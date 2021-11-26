package simplepong

data class Position(val x : Int, val y : Int)
operator fun Position.plus(delta : Delta ) = Position(x+delta.dx, y+delta.dy)

data class Delta(val dx : Int, val dy : Int)
fun randomDelta() = Delta((1..5).random(),(1..5).random())