
fun main(){

	val range1 = 3..10 //[3,10]

	println(range1.first)
	println(range1.last)
	println(range1.count())
	println(5 in range1)
	println(1 in range1)

	val range2 = 3 until 10 //[3,10[
	println(range2.first)
	println(range2.last)
	println(range2.count())
	println(5 in range2)
	println(1 in range2)

	val range3 = 'A' .. 'Z'
	println(range3.first)
	println(range3.last)
	println(range3.count())
	println('A' in range3)
	println('a' in range3)

}