fun main(){

	print("Total em segundos ?")
	val totalSeconds : Int = readLine()!!.toInt()

	val hours : Int = totalSeconds / 3600
	val remainder : Int = totalSeconds % 3600
	val minutes : Int = remainder / 60
	val seconds : Int = remainder % 60


	println("Horas  = " + hours)
	println("Minutos  = " + minutes)
	println("Segundos  = " + seconds)


}