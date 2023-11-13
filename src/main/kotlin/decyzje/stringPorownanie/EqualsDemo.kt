package podstawy.decyzje.stringPorownanie


fun main(args: Array<String>) {
    val imie1 = "Arnold"
    val imie2 = "arnold"
    if (imie1.equals(imie2, ignoreCase = true)) {
        println("Te imiona są takie same")
    } else {
        println("Te imiona różnią się")
    }
}

