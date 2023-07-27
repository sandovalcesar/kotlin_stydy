fun main(args: Array<String>) {
    printHeaer2("Declarando funciones") //TODO llama a la funcion
    var resultado = printfooter2("Funcion con resultado")
    println(resultado)
}

fun printHeaer2 (titulo: String){ //TODO declara la funcion con la variable "titulo"
                                  // de tipo String encargada de recibir un valor
    println("***********************")
    println("*****" + titulo + "*****")
    println("***********************")
}

fun printfooter2 (titulo: String): String{ //TODO justo despues del parentesis
                                          //indicamos el tipo a devolver
    var footer = "***********************\n"
    footer += titulo
    footer = "\n***********************"
    return footer
}