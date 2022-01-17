
enum class Colors(val value : Int) { RED(10), GREEN(20), BLUE(30)}

fun main(){
    val c1 : Colors = Colors.RED
    println(c1.value)
}