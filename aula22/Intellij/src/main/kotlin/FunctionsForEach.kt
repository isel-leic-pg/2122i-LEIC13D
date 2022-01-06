fun main(){

    val l1 = listOf<Int>(5,10,15,20)

    println(l1.map({i -> i +2}))
    println(mapWithForEach(l1,{i -> i +2}))

    println(l1.filter({i -> i % 2 == 0}))
    println(filterWithForEach(l1,{i -> i % 2 == 0}))
}

fun filterWithForEach(l : List<Int>, pred : (Int) -> Boolean) : List<Int>{
    var result = emptyList<Int>()
    l.forEach({i -> result = if(pred(i)) result + i else result})
    return result
}


fun mapWithForEach(l : List<Int>, trans : (Int) -> Int) : List<Int>{
    var result = emptyList<Int>()
    l.forEach({i -> result = result + trans(i)})
    return result
}





