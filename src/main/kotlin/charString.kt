fun main(args: Array<String>) {

    // CHAR

    val c = '1' // TODO se declara una variable char con las comillas simples ''
    val d: Char = '2' // TODO tambien se puede declarar con el tipo de variable antes del valor

    // STRING

    val name: String = "Victoria" // TODO tambien se puede declarar con el tipo de variable antes del valor
    val birthYear = 1991
    val currentYear: Int = 2023

    println("la edad de $name es ${currentYear - birthYear} años ") // TODO se pueden hacer calculos
                                                                    // dentro de las declaraciones mediante el metodo '${}'
}