import pt.isel.canvas.*
import kotlin.math.roundToInt

const val WIDTH : Int = 300
const val HEIGHT : Int =  300

const val SNOWMAN_COLOR : Int = BLACK
const val SNOWMAN_LINE : Int = 3

fun drawSnowMan(cv :Canvas,  x : Int, y : Int, radius : Int){

    //Draw Belly
    cv.drawCircle(x,y,radius,SNOWMAN_COLOR,SNOWMAN_LINE)

    //Draw Head
    val headY : Int =(y - radius * 1.5).roundToInt()
    val headRadius : Int =(radius * 0.5).roundToInt()
    cv.drawCircle(x, headY, headRadius, SNOWMAN_COLOR, SNOWMAN_LINE)

}

fun main() {

    onStart {
        val cv : Canvas = Canvas(WIDTH, HEIGHT)
        drawSnowMan(cv, WIDTH/2, HEIGHT/2, 25)
        //drawSnowMan(cv, cv.width/2, cv.height/2, 25)

    }
    onFinish {
        print("Finish ")
    }
}