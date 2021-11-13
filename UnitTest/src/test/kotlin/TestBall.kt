import kotlin.test.Test
import kotlin.test.assertEquals

class TestBall {

    @Test
    fun testBallX(){
        val b : Ball = Ball(30,100,-10,0,25)
        val moved : Ball = b.move(500,500)
        assertEquals(40,moved.x, "Testing X move")
        assertEquals(10,moved.dx, "Testing X move")

    }



}