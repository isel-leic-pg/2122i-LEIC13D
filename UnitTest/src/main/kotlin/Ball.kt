data class Ball(val x : Int,
                val y : Int,
                val dx : Int,
                val dy : Int,
                val radius : Int = 50,
                 )

fun Ball.move( maxWidth : Int, maxHeight : Int) : Ball{
    val newX = x + dx
    val newBall : Ball = when {
        newX !in radius..maxWidth - radius ->
            Ball(x - dx, y, -dx, dy)
        else -> Ball(x + dx, y, dx, dy)
    }
    return newBall
}