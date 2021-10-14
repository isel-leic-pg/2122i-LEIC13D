fun main(){
	val c1 : Char = 'A'
	//val c2 : Int = c1.toInt() Deprecated
	val i1 : Int = c1.code


	println(c1)
	println(i1)	

	val c2 : Char = '0' + 4
	val i2 : Int = c2.code
	println(c2)	
	println(i2)	


	val str1 : String = "OLA"

	println(str1[0]) //O
	println(str1[1]) //L

	val c3 : Char = str1[2]

	val c4 = c1 + c2

	println(c3)

	println(c4)

}
