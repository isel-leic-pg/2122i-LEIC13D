import pt.isel.canvas.*

data class Position(val x : Int, val y : Int)
operator fun Position.plus(delta : Delta ) = Position(x+delta.dx, y+delta.dy)

data class Delta(val dx : Int, val dy : Int)
fun randomDelta() = Delta((0..5).random(),(0..5).random())

data class Ball(val center : Position,
                val delta : Delta,
                val radius : Int = 50,
                val color : Int = BLACK)


fun Ball.move( maxWidth : Int, maxHeight : Int) : Ball{
    //val newY = y + dy
    //val newX = x + dx
    //val newPosition = Position(center.x + delta.dx, center.y + delta.dy)
    //val newPosition = center.plus(delta)
    val newPosition = center + delta

    val newBall : Ball = when {
        newPosition.x !in radius..maxWidth - radius ->
            Ball(Position(center.x - delta.dx, center.y) ,Delta(-delta.dx , delta.dy))
        newPosition.y !in radius..maxHeight - radius ->
            Ball(Position(center.x, center.y - delta.dy) ,Delta(delta.dx , -delta.dy))
        else -> Ball(newPosition, delta)
    }
    return newBall
}

