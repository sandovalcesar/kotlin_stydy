fun main(args: Array<String>) {
    val llueve: Boolean = true
    val nublado: Boolean = true
    val haceFrio: Boolean = true

    // OR
    if (llueve || haceFrio){
        println("No saldre")
    }

    // AND
    if (nublado && haceFrio){
        println("Seguramente va a llover")
    }

    // NOT
    if (!llueve){
        println("no necesito paraguas")
    }

}