fun main(){
        val l1 = listOf(5,4,3,2,1)
        //l1.add(2) erro de compilação
        println(l1)

        val l2 = mutableListOf(1,7,3,2,5)
        l2.add(6)
        println(l2)
        l2.remove(1)
        println(l2)
        l2[0]=100
        println(l2)
        println(l2[0])


}