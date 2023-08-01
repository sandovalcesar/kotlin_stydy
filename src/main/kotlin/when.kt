fun main(args: Array<String>) {
    val password = "jokspjpcpoa"

    when (password.length) {
        0 -> { println("contraseña vacia") }

        1,2,3,4-> { println("contraseña muy debil") }

        5, 6 -> { println("contraseña debil") }

        else -> { println("contraseña segura") }
    }

    esPar(22325)

}

fun esPar(numero: Int) = when (numero % 2) {
    0 -> println("par")
    else -> println("impar")
}