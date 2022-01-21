


fun main(){
    val  str = "0 1 2 aaa 4"
    val numbersInString : List<String> = str.split(' ')
    val numbers = numbersInString.mapNotNull{it.toIntOrNull()}
    println(numbers)


}