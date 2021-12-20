
fun main(){

    val lines = readLines()
    //lines.forEach({println(it)})
    printLines(lines)
}

fun printLines(lines : List<String>){
    var i = 0
    while(  i < lines.size){
        println(lines[i])
        ++i // i = i + 1
    }
}

fun readLines() : List<String>{
    var lines : List<String> = emptyList()
    var line : String? = readlnOrNull()
    while(line != null){
        lines = lines + line
        line = readLine()
    }
    return lines
}