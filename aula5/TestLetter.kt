fun main(){

	val textLine : String = readLine()!!
	val c : Char = textLine[0]


	//val isLetter : Boolean = c >= 'A' &&  c <= 'Z'
	val isLetter : Boolean = c in 'A'..'Z'
	val isDigit : Boolean = c >= '0' && c <= '9' 


	println("Is Letter " + isLetter)
	println("Is Digit " + isDigit)  


}