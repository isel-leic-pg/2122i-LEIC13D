fun main(){

	val textLine : String = readLine()!!
	val c : Char = textLine[0]

	if(c in 'A'..'Z' || c in 'a'..'z'){
		println("Letra")
	}else{
		if(c in '0'..'9'){
			println("Digito")
		}else{
			println("Nao e Digito nem Letra")
		}
	}


}