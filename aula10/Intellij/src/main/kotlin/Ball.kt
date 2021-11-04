import pt.isel.canvas.*

const val RADIUS = 50
const val CANVAS_HEIGHT = 500
const val CANVAS_WIDTH = 500

data class Ball(val x : Int, val y : Int)

fun drawBall(cv : Canvas, x : Int, y : Int){
    cv.drawCircle(x,y,RADIUS,BLACK)
}

fun main() {

    onStart {
        val cv : Canvas = Canvas(CANVAS_WIDTH, CANVAS_HEIGHT)
        var b : Ball = Ball(cv.width/2,cv.height/2)
        drawBall(cv,b.x,b.y)

        cv.onKeyPressed { k ->

            b = when(k.char){
                'u' -> Ball(b.x,RADIUS)
                'd' -> Ball(b.x, CANVAS_HEIGHT - RADIUS)
                'l' -> Ball(RADIUS,b.y)
                'r' -> Ball(CANVAS_WIDTH - RADIUS,b.y)
                'c' -> Ball(b.x, CANVAS_HEIGHT / 2)
                'm' -> Ball(CANVAS_WIDTH /2 , b.y)
                else -> b
            }

            cv.erase()
            drawBall(cv,b.x,b.y)

        }
    }
    onFinish {
        print("Finish ")
    }

}