data class Time(val hours : Int, val minutes : Int, val seconds : Int)

fun toTime(totalSeconds : Int) : Time{
    val hours : Int = totalSeconds / 3600
    val remainder : Int = totalSeconds % 3600
    val minutes : Int = remainder / 60
    val seconds : Int = remainder % 60

    return Time(hours, minutes, seconds)
}

fun main(){
    //val (hours, minutes) = toTime(7201)
    val (hours, minutes) = Time(1,2,3)
    println(hours)
    println(minutes)
}



