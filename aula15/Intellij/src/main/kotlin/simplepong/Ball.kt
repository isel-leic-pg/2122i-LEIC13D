package simplepong

import pt.isel.canvas.*

data class Ball(val center : Position,
                val delta : Delta,
                val radius : Int = 15,
                val color : Int = BLUE)


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

fun Ball.moveIfCollidesWith(racket : Racket) =
    if(collidesWith(racket)) Ball(Position(center.x - delta.dx, center.y) , Delta(-delta.dx , delta.dy))
    else this


private fun Ball.collidesWith(racket : Racket) =
                           delta.dx < 0   &&
                           center.x in racket.pos.x - radius .. racket.pos.x + racket.width + radius &&
                                   center.y in racket.pos.y -radius .. racket.pos.y + racket.height + radius



