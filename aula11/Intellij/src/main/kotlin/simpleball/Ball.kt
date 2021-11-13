package simpleball

import pt.isel.canvas.*

const val RADIUS = 50
const val CANVAS_HEIGHT = 500
const val CANVAS_WIDTH = 500

data class Ball(val x : Int, val y : Int)

/*fun drawBall(cv : Canvas, ball : Ball){
    cv.drawCircle(ball.x,ball.y,RADIUS,BLACK)
}*/

fun Canvas.drawBall(ball : Ball){
    drawCircle(ball.x,ball.y,RADIUS,BLACK)
}

fun main() {

    onStart {
        val cv : Canvas = Canvas(CANVAS_WIDTH, CANVAS_HEIGHT)
        var b : Ball = Ball(cv.width/2,cv.height/2)
        cv.drawBall(b)

        cv.onKeyPressed { k ->

            b = when(k.char){
                'u' -> b.copy(y = RADIUS)//Ball(b.x,RADIUS)
                'd' -> Ball(b.x, CANVAS_HEIGHT - RADIUS)
                'l' -> Ball(RADIUS,b.y)
                'r' -> Ball(CANVAS_WIDTH - RADIUS,b.y)
                'c' -> Ball(b.x, CANVAS_HEIGHT / 2)
                'm' -> Ball(CANVAS_WIDTH /2 , b.y)
                else -> b
            }

            cv.erase()
            //drawBall(cv, b)
            cv.drawBall(b)

        }
    }
    onFinish {
        print("Finish ")
    }

}