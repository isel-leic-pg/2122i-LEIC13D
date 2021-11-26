package simplepong

data class Game(val width : Int , val height: Int, val balls : List<Ball>, val racket : Racket)


fun buildInitialGame(width: Int, height : Int) : Game{
    val racket = Racket(Position(10, height/2), 15, 60)
    val balls = emptyList<Ball>()
    return Game(width, height,balls,racket)
}

fun Game.step() :Game{

    //val ballsMoved : List<Ball?> = balls.map({ ball -> ball.move(width, height)})
    //val ballsMovedWithoutNulls = ballsMoved.filterNotNull()
    val ballsMovedWithoutNulls = balls.mapNotNull ({ ball -> ball.move(width, height)})
    val ballsMoved = ballsMovedWithoutNulls.map({ ball -> ball.moveIfCollidesWith(racket)})

    return Game(width,height,ballsMoved,racket)
}

fun Game.addBall() :Game{
    val newBalls = balls + Ball(Position(width/2, height/2), randomDelta())
    return Game(width,height,newBalls,racket)
}

fun Game.moveRacket(newY : Int) : Game{
    val newRacket = racket.move(newY)
    return Game(width,height,balls,newRacket)

}