import pt.isel.canvas.*

const val CANVAS_WIDTH = 500
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
    val newX = x + dx
    val newBall : Ball = when {
        newX !in radius..maxWidth - radius ->
            Ball(x - dx, y, -dx, dy)
        else -> Ball(x + dx, y, dx, dy)
    }
    return newBall
}

fun main() {

    onStart {
        val cv : Canvas = Canvas(CANVAS_WIDTH, CANVAS_HEIGHT, WHITE)
        var b : Ball = Ball(cv.width/2, cv.height/2,4,0)
        cv.onTimeProgress(10) {
            b = b.move(cv.width, cv.height)
            cv.erase()
            cv.drawBall(b)
        }

    }
    onFinish {
        print("Finish ")
    }

}