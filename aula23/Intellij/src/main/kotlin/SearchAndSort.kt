


fun min(l : List<Int>) : Int{
    var min = l[0]
    for(i in l){
        if(i < min ) min = i
    }
    return min
}

fun sort( l : List<Int>): List<Int>{
    var vl = l
    var res = emptyList<Int>()
    while(vl.isNotEmpty()){
        val m = min(vl)
        vl = vl - m
        res = res + m
    }
    return res
}

fun sortMutable( l : List<Int>): List<Int>{
    var vl = l.toMutableList()
    var res = mutableListOf<Int>()
    while(vl.isNotEmpty()){
        val m = min(vl)
        vl.remove(m)
        res.add(m)
    }
    return res
}

fun main(){
    val l1 = listOf(1,2,3,4)

    println(indexOf(l1,3))
    println(indexOf(l1,10))

    println(min(listOf(2,34,56,6)))
    println(min(listOf(1,2,3,4)))

    val l2 = listOf(2,35,3,15,6)

    println(sort(l2))
    println(sortMutable(l2))

}



