fun main(args: Array<String>) {
    val password = "jokspjpcpoa"

    when (password.length) {
        0 -> { println("contraseña vacia") }

        in 1.rangeTo(4) -> println("contraseña muy debil")

        in 5, 6 -> { println("contraseña debil") }

        else -> { println("contraseña segura") }
    }

    esPar(22325)

}

fun esPar(numero: Int) = when (numero % 2) {
    0 -> println("par")
    else -> println("impar")
}