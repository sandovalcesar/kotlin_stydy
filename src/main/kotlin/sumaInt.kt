fun main(args: Array<String>) {
    var operador1 = 5
    var operador2 = 10

    println("La suma de $operador1 + $operador2 es " +
            "${sumaInt((operador1),(operador2))}") // TODO envia parametros
}

fun sumaInt (op1: Int, op2: Int): Int{ // TODO resive parametros
    return op1 + op2
}