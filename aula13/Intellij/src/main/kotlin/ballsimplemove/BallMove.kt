package ballsimplemove

import pt.isel.canvas.*

const val CANVAS_WIDTH = 700
const val CANVAS_HEIGHT = 500

data class Ball(val x : Int,
                val y : Int,
                val dx : Int,
                val dy : Int,
                val radius : Int = 50,
                val color : Int = BLACK)


fun Canvas.drawBall(ball : Ball){
    drawCircle(ball.x,ball.y, ball.radius, ball.color ,BLACK)
}

fun Ball.move( maxWidth : Int, maxHeight : Int) : Ball{
    val newY = y + dy
    val newX = x + dx
    val newBall : Ball = when {
        newX !in radius..maxWidth - radius ->
            Ball(x - dx, y, -dx, dy)
        newY !in radius..maxHeight - radius ->
            Ball(x , y - dy , dx, -dy)
        else -> Ball(newX, newY, dx, dy)
    }
    return newBall
}

fun main() {

    onStart {
        val cv : Canvas = Canvas(CANVAS_WIDTH, CANVAS_HEIGHT, WHITE)
        var b : Ball = Ball(50, cv.height/2,(0..5).random(),(0..5).random())
        cv.onTimeProgress(10) {
            b = b.move(cv.width, cv.height)
            cv.erase()
            cv.drawBall(b)
        }

        cv.onTimeProgress(2000){
            b= Ball((50..400).random(), cv.height/2,(0..5).random(),(0..5).random())
            cv.erase()
            cv.drawBall(b)
        }

    }
    onFinish {
        print("Finish ")
    }

}