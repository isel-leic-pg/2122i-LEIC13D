fun main(){

	val hours : Int = readInt("Horas? ")
	val minutes : Int = readInt("Minutos ?")
	val seconds : Int = readInt("Segundos ?")

	val totalSeconds : Int = hMSToS(hours, minutes, seconds)

	println("O tempo total e  $totalSeconds segundos")
}

fun hMSToS(h : Int, m : Int, s : Int): Int{
	val tSeconds : Int = h * 3600 + m * 60 + s
	return tSeconds
}


