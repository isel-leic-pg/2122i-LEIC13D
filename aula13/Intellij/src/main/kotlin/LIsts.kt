
fun main(){

    val l1 : List<Int> = listOf(6, 10, 5, 4, 6)

    println(l1)
    println(l1[0])
    println(l1.size)

    l1.forEach(::printDouble)
    l1.forEach({elem : Int -> println(2*elem)})

    //val l2 = l1.map(::triple)
    val l3 = l1.map({elem : Int -> 3 * elem})
    println(l3)

}

fun triple(elem : Int) = 3 * elem

fun printDouble(elem : Int){
    println(2*elem)
}