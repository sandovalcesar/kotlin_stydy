const val numero = 1 // TODO --Las constantes se declaran fuera del metodo main--

fun main(args: Array<String>) {

    var titulo = "the Good Book" // TODO --Las variables son inferidas y se declaran con var--
    var subtitulo: String // TODO --Si la variable no esta inicializada con un valor debe ser declada con un tipo--
    subtitulo = "Español e Ingles" // TODO --La variable fue inicializada"
    println("Este libro se llama $titulo y esta traducido a los idiomas $subtitulo") //TODO --Para concatenar la variable se usa $nombre_de_variable--

    val mensaje = "Mundo" // TODO --variable de tipo "read only" se declara "val"--
    val mensajeCompleto = "Hola $mensaje" //TODO "estas variables no son constantes porque se puede mutar en el momento de la ejecucion"
    println(mensajeCompleto)

    printHeader("Declarando funciones") // TODO --llama a la funcion que esta fuera del metodo main--
    var resultado = printFooter("Funcion con resultados")
    println(resultado)
}

fun printHeader (titulo: String){ // TODO --nombre de la funcion despues de "fun" dentro del () el nombre del parametro y el tipo
    println(">>>>>>>>>>>>>>>")
    println(">>>>$titulo<<<<") // TODO --contenido de la funcion--
    println("<<<<<<<<<<<<<<<")
    println("")
}

fun printFooter (titulo: String): String{ // TODO --funcion con devolucion se declara el tipo de dato a devolver despues del parentesis--
    var footer = "*******************\n" // TODO --variable de retorno--
    footer += titulo
    footer += "\n*******************"
    return footer // TODO --variable a retornar--
}