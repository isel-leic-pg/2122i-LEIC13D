
fun printList(l : List<Int>){
    for(i in l){
        println(i)
    }
}

fun printListRecur(l : List<Int>, idx : Int ){
    if(idx >= l.size) return
    println(l[idx])
    return printListRecur(l, idx + 1)
}

fun indexOf(l : List<Int>, v: Int ) : Int?{
    for(idx in l.indices /*0 until l.size*/){
        if(l[idx] == v) return idx
    }
    return null
}

fun indexOfRecur(l : List<Int>, idx : Int, v : Int): Int?{
    if(idx >= l.size) return null
    if(l[idx] == v) return idx
    val res = indexOfRecur(l, idx + 1, v)
    return res
}

fun indexOfRecurWhen(l : List<Int>, idx : Int, v : Int): Int? =
    when {
        idx >= l.size -> null
        l[idx] == v-> idx
        else -> indexOfRecurWhen(l, idx + 1, v)
    }


fun x(l : List<Int>, v : Int) : Boolean{
    if(l.isEmpty()) return false
    if(l[0]==v) return true
    return x(l.drop(1), v)
}

fun sum(l : List<Int>, idx : Int) : Int{
    if(idx >= l.size) return 0
    val res = sum(l, idx + 1)
    return res + l[idx]
}

fun xDrop(l : List<Int>) : Int{
    println("Size - ${l.size}")
    if(l.isEmpty()) return 0
    val res = xDrop(l.drop(1)) + l[0]
    println("Result = $res")
    return res
}

//0! = 1
//n! = (n-1)! * n

fun factorial(n : Int) : Int = if (n == 0) 1 else factorial(n -1) * n

fun main(){

    factorial(3)

    val l1 = listOf(1,2,3)
    printList(l1)

    printListRecur(l1,0)
    //printListRecur((0..10000).toList(),0)

    println(indexOf(l1,3))
    println(indexOf(l1,6))

    println(indexOfRecur(l1,0,3))
    println(indexOfRecur(l1,0,6))

    println(indexOfRecurWhen(l1,0,3))
    println(indexOfRecurWhen(l1,0,6))

    println(x(l1,3))
    println(x(l1,6))

    println(sum(l1,0))
    println("Sum with Drop")
    println(xDrop(l1))

    val l2 = l1.drop(2)
    println(l2)

}