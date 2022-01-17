
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

fun sum(l : List<Int>, idx : Int) : Int{
    if(idx >= l.size) return 0
    val res = sum(l, idx + 1)
    return res + l[idx]
}


fun main(){

    val l1 = listOf(1,2,3,4)
    printList(l1)

    printListRecur(l1,0)
    //printListRecur((0..10000).toList(),0)

    println(indexOf(l1,3))
    println(indexOf(l1,6))

}