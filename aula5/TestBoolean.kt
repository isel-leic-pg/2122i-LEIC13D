fun main(){

	val op1 : Int = readLine()!!.toInt()
	val op2 : Int = readLine()!!.toInt()

	val b1 : Boolean = op1 == op2
	val b2 : Boolean = op1 != op2

	println("Equal = " + op1)
	println("Not Equal = " + op2)
	println(op1 > op2)
	println(op1 >= op2)
	println(op1 <= op2)
	println(op1 < op2)


}