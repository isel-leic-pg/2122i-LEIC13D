package aula14

fun executeAndPrint(op1 : Int, op2 : Int, func : (Int,Int) -> Int ){
    val res : Int = func(op1, op2)
    println(" Resultado = $res")
}

fun add(a : Int,b : Int) : Int = a + b

typealias Operation = (Int,Int) -> Int

fun main(){

    //val c : (Int,Int) -> Int = ::add
    val c : Operation = ::add
    c(1,2)
    executeAndPrint(1,2, c)
    executeAndPrint(1,2, ::add)
    executeAndPrint(1,2, {a : Int, b :Int -> a + b })
    executeAndPrint(1,2, {a : Int, b :Int -> a / b })
    executeAndPrint(1,2, {a : Int, b :Int -> a * b * 4 })

    executeAndPrint(1,2) {
            a : Int, b :Int -> a * b * 4
    }
}
