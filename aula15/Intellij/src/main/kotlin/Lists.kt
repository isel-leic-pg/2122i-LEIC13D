
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

    //val l4 = l1.filter(::isEven)
    val l4 = l1.filter({elem : Int-> elem % 2 == 0})
    println(l4)

    val i1 = l1.fold(0, ::add)
    println(i1)

    val l5 = l1 - 6
    println(l5)

    val l6 = l5 - l1.first()
    println(l6)

}

fun add(acc : Int, elem : Int) = acc + elem

fun isEven(elem : Int) = elem % 2 == 0

fun triple(elem : Int) = 3 * elem

fun printDouble(elem : Int){
    println(2*elem)
}