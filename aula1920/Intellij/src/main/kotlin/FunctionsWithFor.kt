fun main(){

    val l1 = listOf<Int>(5,10,15,20)
    l1.forEach({i -> println(i)})
    forEachWithFor(l1, {i -> println(i)})
}

fun forEachWithFor(l : List<Int>, f : (Int) -> Unit){
    /*for(idx in 0 until l.size){
        f(l[idx])
    }*/

   for(i in l){
       f(i)
   }
}

fun mapWithFor(l : List<Int>, trans : (Int) -> Int) : List<Int>{
    var result = emptyList<Int>()
    for(i in l){
        result = result + trans(i)
    }
    return result
}

fun filterWithFor(l : List<Int>, pred : (Int) -> Boolean) : List<Int>{
    var result = emptyList<Int>()
    for(i in l){
        result = if(pred(i)) result + i else result
    }
    return result
}

