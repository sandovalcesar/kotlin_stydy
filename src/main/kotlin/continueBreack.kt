fun main(args: Array<String>) {
	bucleMadre@ for (i in 1 .. 10) {
		for (j in 1 .. 10) {
			if (i == 5 && j == 5) {
				println("estamos en la mitad")
				break@bucleMadre
			} else {
				println("i=$i, j=$j")
			}
		}
	}
}