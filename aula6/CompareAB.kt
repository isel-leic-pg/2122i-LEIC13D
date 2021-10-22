fun main(){

	print("A ? ")
	val a : Int = readLine()!!.toInt()
	print("B ? ")
	val b : Int = readLine()!!.toInt()


	if(a > b){
		println("A e maior que B")
	}else{
		if(a == b){
			println("A e igual a B ")
		}else{
			println("A e menor que B ")
		}
	}
}	