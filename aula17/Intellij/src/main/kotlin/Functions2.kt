
fun test(i : Int, f: (Int)->Int){
    val res = f(i)
    println(res)
}


fun main(){
    test(5, { x -> x + 5})
    test(5) { x -> x + 5 }
    test(5) { it + 5 }
}