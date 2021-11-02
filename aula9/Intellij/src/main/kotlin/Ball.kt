import pt.isel.canvas.*

const val RADIUS = 50
const val CANVAS_HEIGHT = 500
const val CANVAS_WIDTH = 500

fun drawBall(cv : Canvas, x : Int, y : Int){
    cv.drawCircle(x,y,RADIUS,BLACK)
}

fun main() {

    onStart {
        val cv : Canvas = Canvas(CANVAS_WIDTH, CANVAS_HEIGHT)
        drawBall(cv,cv.width/2,cv.height/2)

        cv.onKeyPressed { k ->
            if(k.char == 'l'){
                cv.erase()
                drawBall(cv,RADIUS,CANVAS_HEIGHT/2)
            }

        }
    }
    onFinish {
        print("Finish ")
    }

}