package simplepong

import pt.isel.canvas.Canvas
import pt.isel.canvas.WHITE
import pt.isel.canvas.onFinish
import pt.isel.canvas.onStart

const val CANVAS_WIDTH = 700
const val CANVAS_HEIGHT = 500

fun main() {

    onStart {
        val cv : Canvas = Canvas(CANVAS_WIDTH, CANVAS_HEIGHT, WHITE)
        var game = buildInitialGame(cv.width, cv.height)

        //call game step
        cv.onTimeProgress(10) {
           game = game.step()
            cv.drawGame(game)
        }

        cv.onTimeProgress(1000) {
            game = game.addBall()
        }

        cv.onMouseMove { me ->
            game = game.moveRacket(me.y)
        }


    }
    onFinish {
        print("Finish ")
    }

}