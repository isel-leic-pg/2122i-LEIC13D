fun main(){

    val l1 = listOf<Int>(5,10,15,20)
    l1.forEach({i -> println(i)})
    forEach(l1, {i -> println(i)})

    println(l1.map({i -> i +2}))
    println(map(l1,{i -> i +2}))

    println(l1.filter({i -> i % 2 == 0}))
    println(filter(l1,{i -> i % 2 == 0}))
}

fun filter(l : List<Int>, pred : (Int) -> Boolean) : List<Int>{
    var result = emptyList<Int>()
    var i = 0
    while(  i < l.size){
        result = if(pred(l[i])) result + l[i] else result
        ++i // i = i + 1
    }
    return result
}


fun map(l : List<Int>, trans : (Int) -> Int) : List<Int>{
    var result = emptyList<Int>()
    var i = 0
    while(  i < l.size){
        result = result + trans(l[i])
        ++i // i = i + 1
    }
    return result
}

fun forEach(l : List<Int>, f : (Int) -> Unit){
    var i = 0
    while(  i < l.size){
        f(l[i])
        ++i // i = i + 1
    }
}

