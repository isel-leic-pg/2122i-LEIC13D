

fun main(){
    val ts = listOf(Time(1,1,1), Time(2,2,2), Time(2,2,3))

    val l1 = ts.mapIndexed {idx, time ->
        println(idx)
        println(time)
        time.hours
    }
    println(l1)

    println(ts.any{ it.hours == 1 })

    println(ts.find{ it.hours == 2 })
    println(ts.find{ it.hours == 5 })
    println(ts.findLast{ it.hours == 2 })

    println(ts.shuffled())
    println(ts.take(2))
    println(ts.random())

}