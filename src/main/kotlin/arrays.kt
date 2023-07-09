fun main(args: Array<String>) {
    val arrayPares: IntArray = intArrayOf(0,2,4,6,8)  // TODO array de tipo entero
    println(arrayPares[1])

    val arrayImpares: IntArray = IntArray(10) {it +2}
    println(arrayImpares[0])
    println(arrayImpares[1])
}