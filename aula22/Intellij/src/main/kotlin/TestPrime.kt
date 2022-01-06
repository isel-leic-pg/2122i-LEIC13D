fun main(){
    println(testPrime(5)) //true
    println(testPrime(4)) //false
}

fun testPrime(n : Int): Boolean{
    var isPrime = true
    var i = 2
    while(isPrime && i < n){
        if(n % i == 0) isPrime = false
        ++i
    }
    return isPrime
}

fun testPrimeBreak(n : Int): Boolean{
    var isPrime = true
    var i = 2
    while(i < n){
        if(n % i == 0){
            isPrime = false
            break
        }
        ++i
    }
    return isPrime
}

fun testPrimeReturn(n : Int): Boolean{
    var i = 2
    while(i < n){
        if(n % i == 0) return false
        ++i
    }
    return true
}