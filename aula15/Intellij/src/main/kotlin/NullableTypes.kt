
data class XY(val x : Int?, val y : Int?)

fun main(){

    var maybeLine : String? = "Hello World"
    maybeLine = null

    println(if(maybeLine != null) maybeLine.length else null)
    println(maybeLine?.length)
    println(maybeLine?.substring(1,3))

    val i : Int? = if(maybeLine != null) maybeLine.length else null

    println(if(maybeLine != null) maybeLine.length else 0)
    println(maybeLine?.length ?: 0 )

    val xy : XY = XY(null,2)
    println(xy.x?.toDouble())
}
