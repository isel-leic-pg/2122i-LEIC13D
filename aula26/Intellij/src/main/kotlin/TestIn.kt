data class Time(val hours : Int, val minutes : Int, val seconds : Int)

fun main(){

    val li = listOf<Int>(1,2,3)
    println( 1 in li )
    println( 4 in li )

    val str = "HELLO WORLD"
    println( 'H' in str )
    println( "HE" in str )
    println( 'Y' in str )

    val lt = listOf(Time(1,2,3),Time(1,2,4))
    println( Time(1,2,3) in lt)
    println( Time(1,2,5) in lt )

}