

fun main(){
    println("Quantos numeros quer introduzir?")
    val n = readln().toInt()

    val array = Array<Int>(n){0}

    for(idx in 0 until n){
        println("Valor ${idx + 1} ?")
        val number = readln().toInt()
        array[idx]=number
    }
    println(array.contentToString())
    var sum = 0
    for(i in array){
        //sum = sum + i
        sum+=i
    }
    println(sum)
    val average = sum / n
    println("Average = ${average}")

    for(i in array){
        if(i > average) println(i)
    }
}