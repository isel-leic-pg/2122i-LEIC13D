package simplepong

data class Racket(val pos : Position, val width : Int, val height : Int)

fun Racket.move(newY : Int) = Racket(Position(pos.x, newY), width, height)