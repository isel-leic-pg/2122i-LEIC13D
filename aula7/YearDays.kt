fun main(){

	println("Year? ")
	val year : Int = readLine()!!.toInt() 
	
	val days : Int = if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) 366 else 365

	println("Total days $days")


}