import pt.isel.canvas.Canvas
import pt.isel.canvas.WHITE
import pt.isel.canvas.onFinish
import pt.isel.canvas.onStart

const val CANVAS_WIDTH = 700
const val CANVAS_HEIGHT = 500

fun main() {

    onStart {
        val cv : Canvas = Canvas(CANVAS_WIDTH, CANVAS_HEIGHT, WHITE)
        var balls: List<Ball> = listOf( Ball(Position(50, cv.height/2), randomDelta()),
                                 Ball(Position(50, cv.height/2), randomDelta()))


        cv.onTimeProgress(10) {
            balls = balls.map({ball -> ball.move(cv.width, cv.height)})
            cv.erase()
            balls.forEach({ball ->cv.drawBall(ball) })
        }


    }
    onFinish {
        print("Finish ")
    }

}