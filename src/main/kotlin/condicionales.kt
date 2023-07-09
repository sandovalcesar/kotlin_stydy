fun main(args: Array<String>) {
    val name1 = "Maria"
    val name2 = "Juan"

    // Invocar el metodo1
    getLongestName(name1, name2)

    // Invocar el metodo2
    getLongestName2(name1, name2)

    // Invocar el metodo2
    getLongestName3(name1, name2)

}
fun getLongestName(name1: String, name2: String) {
    var longesName = name2
    if (name1.length > name2.length) longesName = name1
    println("El nombre mas largo es $longesName")
}

fun getLongestName2(name1: String, name2: String) {
    var longesName = ""
    if (name1.length > name2.length) {
        longesName = name1
    } else {
        longesName = name2
    }
    println("El nombre mas largo es $longesName")
}
fun getLongestName3(name1: String, name2: String) {
    val longesName = if (name1.length > name2.length) { // TODO es obligartorio poner el else
        println("el nombre mas largo es $name1")
        name1 // TODO return
    } else {
        println("el nombre mas largo es $name2")
        name2
    }

}