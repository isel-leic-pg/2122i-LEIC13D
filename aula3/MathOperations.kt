fun main()
{
	print("Operando 1 ? ")
	val op1Text : String = readLine()!!
	
	print("Operando 2 ? ")
	val op2Text : String = readLine()!!

	val op1 : Int = op1Text.toInt()
	val op2 : Int = op2Text.toInt()

	val add : Int = op1 + op2
	val sub : Int = op1 - op2
	val mul : Int = op1 * op2
	val div : Int = op1 / op2
	val rem : Int = op1 % op2


	println("AD = " + add)
	println("SUB = " + sub)
	println("MUL = " + mul)
	println("DIV = " + div)
	println("RES = " + rem)


}