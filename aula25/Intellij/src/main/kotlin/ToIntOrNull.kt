fun main(){

    val numbersInString = listOf("0","1","2","aaa","4")
    val numbers = numbersInString.mapNotNull{it.toIntOrNull()}
    println(numbers)

}