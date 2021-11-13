


data class HMS(val hours : Int, val minutes : Int, val seconds : Int)

fun main(){

	print("Total em segundos ?")
	val totalSeconds : Int = readLine()!!.toInt()

	val hms  = sToHMS(totalSeconds)

	println("Horas  = " + hms.hours)
	println("Minutos  = " + hms.minutes)
	println("Segundos  = " + hms.seconds)


}

fun sToHMS(totalSeconds : Int)  : HMS {
	val hours : Int = totalSeconds / 3600
	val remainder : Int = totalSeconds % 3600
	val minutes : Int = remainder / 60
	val seconds : Int = remainder % 60
	return HMS(hours, minutes, seconds)


}