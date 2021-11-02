import pt.isel.canvas.*

fun main() {
    print("Begin ")
    onStart {
        val arena = Canvas(300, 200)
        arena.drawCircle(arena.width/2, arena.height/2,
                        50, GREEN, 3 )
        var x : Int = 10
        arena.onKeyPressed { k ->
            arena.drawText(x, 40, k.char.toString())
            x += 20 }
        print("Start ")
    }
    onFinish {
        print("Finish ")
    }
    print("End ")
}