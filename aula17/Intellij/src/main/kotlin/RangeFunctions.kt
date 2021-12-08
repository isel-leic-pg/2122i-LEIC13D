fun main(){

    val r = 5..10

    r.forEach {i -> println(i)}

    val l1 = r.map {i -> i + 1}
    println(l1)

}