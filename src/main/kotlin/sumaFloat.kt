fun main(args: Array<String>) {

    // FLOAT

    var operando1 = 4.5f // TODO --Para identificar un float se pone una f al final--
    var operando2 = 12.2f

    var resultado = sumaFloat(operando1, operando2)
    println("el resultado de $operando1 + $operando2 = $resultado")

    // DOUBLE

    var operando3 = 5.5 // TODO --Los double no llevan f--
    var operando4 = 12.5

    var resultado_do = sumaDouble(operando3, operando4)
    println("el resultado de $operando3 + $operando4 = $resultado_do")
}

fun sumaDouble(op3: Double, op4: Double): Double {
    return op3 + op4
}

fun sumaFloat(op1: Float, op2: Float): Float {
    return op1+op2
}
