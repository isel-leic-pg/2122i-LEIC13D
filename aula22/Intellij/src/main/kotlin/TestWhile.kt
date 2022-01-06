fun main(){
    f()
}

fun f(){
    var i = 0
    var k = 0
    while( i < 2){

        while(k < 3){
            println("i = $i k = $k")
            ++k
        }
        ++i
    }
}