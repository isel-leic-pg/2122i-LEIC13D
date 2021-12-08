
fun main(){

    val s1 = "Hello World"

    //s.forEach { c -> println(c - 1) }
    s1.forEach { print(it - 1) }

    val l1 : List<Char> = s1.map {it.uppercaseChar()}
    val s2 : String = l1.joinToString()
    println(s2)

    val l2 = l1.filter {c -> c != ' '}.joinToString("")
    println(l2)

    val s3 = s1.map( {c -> c.uppercaseChar()})
                .filter {c -> c != ' '}
                .joinToString("")
    println(s3)


}