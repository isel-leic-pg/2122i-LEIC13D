package multiball

import pt.isel.canvas.BLACK
import pt.isel.canvas.Canvas

fun Canvas.drawBall(ball : Ball){
    drawCircle(ball.center.x,ball.center.y, ball.radius, ball.color , BLACK)
}