fun main(){

	val textLine : String = readLine()!!
	val c : Char = textLine[0]


	when{
		c in 'A'..'Z' -> println("Letra Maiuscula")
		c in 'a'..'z' -> println("Letra Minuscula")
		c in '0'..'9' -> println("Digito")
		else -> println("Nao e Digito nem Letra")
	}

    //Como instrução
	when(c){
		in 'A'..'Z' -> println("Letra Maiuscula")
		in 'a'..'z' -> println("Letra Minuscula")
		in '0'..'9' -> println("Digito")
		else -> println("Nao e Digito nem Letra")
	}

	//Como expressão
	val text : String = 
		when(c){
			in 'A'..'Z' -> "Letra Maiuscula"
			in 'a'..'z' -> "Letra Minuscula"
			in '0'..'9' -> "Digito"
			else -> "Nao e Digito nem Letra"
		}
	println(text)


	
	/*if(c in 'A'..'Z' ){
		println("Letra Maiuscula")
	}else{
		if(c in 'a'..'z'){
			println("Letra Minuscula")
		}else{
			if(c in '0'..'9'){
				println("Digito")
			}else{
				println("Nao e Digito nem Letra")
			}
		}
	}*/


}