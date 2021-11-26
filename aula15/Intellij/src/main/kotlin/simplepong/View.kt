package simplepong

import pt.isel.canvas.BLACK
import pt.isel.canvas.Canvas

fun Canvas.drawBall(ball : Ball){
    drawCircle(ball.center.x,ball.center.y, ball.radius, ball.color , BLACK)
}

fun Canvas.drawRacket(racket : Racket){
    drawRect(racket.pos.x, racket.pos.y, racket.width, racket.height, BLACK)
}


fun Canvas.drawGame(game : Game){
    erase()
    drawRacket(game.racket)
    game.balls.forEach({ball ->drawBall(ball) })

}