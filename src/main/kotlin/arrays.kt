fun main(args: Array<String>) {
    val arrayPares: IntArray = intArrayOf(0,2,4,6,8)  // TODO array de tipo entero
    println(arrayPares[4])
    println("------------")
    val arrayImpares: IntArray = IntArray(10) {2} //TODO {constructor}
    println(arrayImpares[0])
    println(arrayImpares[1])
    println("------------")

    val arrayImparesV2: IntArray = IntArray(15) {it*2} //TODO it = iterador
    println(arrayImparesV2[0])
    println(arrayImparesV2[1])
    println(arrayImparesV2[2])
    println("------------")
}