package multiball

import pt.isel.canvas.*

data class Ball(val center : Position,
                val delta : Delta,
                val radius : Int = 50,
                val color : Int = BLACK)


fun Ball.move(maxWidth : Int, maxHeight : Int) : Ball?{

    val newPosition = center + delta
    val newBall : Ball? = when {
        newPosition.x < radius -> null
        newPosition.x > maxWidth - radius ->
            Ball(Position(center.x - delta.dx, center.y) , Delta(-delta.dx , delta.dy))
        newPosition.y !in radius..maxHeight - radius ->
            Ball(Position(center.x, center.y - delta.dy) , Delta(delta.dx , -delta.dy))
        else -> Ball(newPosition, delta)
    }
    return newBall
}

