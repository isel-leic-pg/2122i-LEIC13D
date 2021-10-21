fun main(){

	print("Ficha 1 ? ")
	val f1 : Int = readLine()!!.toInt()
	print("Ficha 2 ? ")
	val f2 : Int = readLine()!!.toInt()
	print("Ficha 3 ? ")
	val f3 : Int = readLine()!!.toInt()

	print("Teorica ? ")
	val nt : Int = readLine()!!.toInt()

	print("Pratica ? ")
	val np : Int = readLine()!!.toInt()

	val result = ((f1+f2+f3)/3.0 * 0.2 + nt * 0.4 + np * 0.4) + 0.5

	println("Nota de programacao = " + result.toInt())




}