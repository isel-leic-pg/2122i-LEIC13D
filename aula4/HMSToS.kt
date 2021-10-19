fun main(){

	print("Horas ?")
	val hours : Int = readLine()!!.toInt()
	print("Minutos ?")
	val  minutesText : String = readLine()!!
	print("Segundos ?")
	val  secondsText : String = readLine()!!

	//val hours : Int = hoursText.toInt()
	val minutes : Int = minutesText.toInt()
	val seconds : Int = secondsText.toInt()

	val totalSeconds : Int = hours * 3600 + minutes * 60 + seconds

	println("O tempo total e " + totalSeconds + " segundos")

}