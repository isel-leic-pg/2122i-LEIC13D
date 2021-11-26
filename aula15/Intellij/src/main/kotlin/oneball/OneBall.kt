package oneball

import pt.isel.canvas.*

const val CANVAS_WIDTH = 700
const val CANVAS_HEIGHT = 500

data class Position(val x : Int, val y : Int)
operator fun Position.plus(delta : Delta ) = Position(x+delta.dx, y+delta.dy)

data class Delta(val dx : Int, val dy : Int)
fun randomDelta() = Delta((1..5).random(),(1..5).random())

data class Ball(val center : Position,
                val delta : Delta,
                val radius : Int = 50,
                val color : Int = BLACK)


fun Ball.move( maxWidth : Int, maxHeight : Int) : Ball?{

    val newPosition = center + delta
    val newBall : Ball? = when {
        newPosition.x < radius -> null
        newPosition.x > maxWidth - radius ->
            Ball(Position(center.x - delta.dx, center.y) ,Delta(-delta.dx , delta.dy))
        newPosition.y !in radius..maxHeight - radius ->
            Ball(Position(center.x, center.y - delta.dy) ,Delta(delta.dx , -delta.dy))
        else -> Ball(newPosition, delta)
    }
    return newBall
}

fun Canvas.drawBall(ball : Ball?){
     if(ball != null) drawCircle(ball.center.x,ball.center.y, ball.radius, ball.color , BLACK)
}
fun main() {

    onStart {
        val cv : Canvas = Canvas(CANVAS_WIDTH, CANVAS_HEIGHT, WHITE)
        var b : Ball? = Ball(Position(50, cv.height/2), randomDelta())
        cv.onTimeProgress(10) {
            b = b?.move(cv.width, cv.height)
            cv.erase()
            cv.drawBall(b)
        }

        cv.onKeyPressed {
            b  = if(b == null) Ball(Position(50, cv.height/2), randomDelta()) else b
        }

    }
    onFinish {
        print("Finish ")
    }

}