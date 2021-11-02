fun main(){
    funWithoutParameters()
    funWithParameters(1, "2") //Chamada com argumentos posicionais
    funWithParameters(parm2 ="2", parm1 =1)

    val text : String = funReturnString()
    println(text)
    val v : Int = funReturnInt()
    println(v)

    funWithTheSameName()
    funWithTheSameName(1,"2")
    funWithTheSameName("2",1)

}

fun funSingleExpression(a : Int, b: Int) : Int  = a + b

/*fun funSingleExpression(a : Int, b: Int) : Int {
    return a+b
}*/

fun funWithTheSameName(parm1: String, parm2: Int) {
    println("funWithTheSameName")
    println("Parametro 1 = $parm1")
    println("Parametro 2 = $parm2")
}


fun funWithTheSameName(parm1: Int, parm2: String) {
    println("funWithTheSameName")
    println("Parametro 1 = $parm1")
    println("Parametro 2 = $parm2")
}

fun funWithTheSameName() {
    println("funWithTheSameName")
}

fun funWithParameters(parm1 : Int, parm2 : String){
    println("funWithParameters")
    println("Parametro 1 = $parm1")
    println("Parametro 2 = $parm2")
}

fun funReturnString():String{
    return "Return String"
}

fun funReturnInt():Int{
    return 12
}

fun funWithoutParameters(){
    println("funWithoutParameters")
}

fun funWithDefaultValue(parm1 : Int, parm2 : String = "OLA"){
    println("funWithParameters")
    println("Parametro 1 = $parm1")
    println("Parametro 2 = $parm2")
}

/*fun funWithoutParameters(parm1 : Int){
    parm1 = 12  //ERRO

}*/
