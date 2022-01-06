fun readNonEmptyLine():String{
    var line : String
    do{
        println("Introduza uma linha")
        line = readln()
    }while(line.isEmpty());
    return line
}

fun main(){
    val line =  readNonEmptyLine()
    println(line)
}