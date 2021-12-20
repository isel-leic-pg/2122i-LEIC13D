
import pt.isel.canvas.*

const val SPRITE_SIDE = 64
const val DELTA = 5

enum class Direction {DOWN, LEFT, RIGHT, UP}

data class Position(val x : Int, val y : Int)
data class Hero(val pos : Position, val animationStep : Int = 0, val dir : Direction = Direction.DOWN)

fun Hero.move(newDir :Direction) : Hero{
    val animationStep = if(dir == newDir) (animationStep + 1) % 4 else 0
    val newPos = when(dir){
        Direction.DOWN -> Position(pos.x, pos.y + DELTA)
        Direction.UP -> Position(pos.x, pos.y - DELTA)
        Direction.LEFT -> Position(pos.x - DELTA, pos.y )
        Direction.RIGHT -> Position(pos.x + DELTA, pos.y)
    }
    return Hero(newPos, animationStep, newDir)
}

fun Hero.draw(cv : Canvas){
    cv.erase()
    val x = animationStep * SPRITE_SIDE
    val y = dir.ordinal * SPRITE_SIDE
    cv.drawImage("hero|${x},${y},64,64", pos.x, pos.y )
}

fun toDirection(key : Char) : Direction? =
    when(key){
       'w' -> Direction.UP
        's' -> Direction.DOWN
        'a' -> Direction.LEFT
        'd' -> Direction.RIGHT
        else -> null
    }

fun main() {

    onStart {
        val cv : Canvas = Canvas(800, 600, WHITE)
        var hero = Hero(Position(cv.width/2,cv.height/2), 0)
        hero.draw(cv)

        cv.onKeyPressed { k ->
            val dir : Direction? = toDirection(k.char)
            hero = if(dir!=null) hero.move(dir) else hero
            hero.draw(cv)
        }

    }
    onFinish {
        print("Finish ")
    }

}