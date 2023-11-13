package podstawy.decyzje

import java.util.*


fun main(args: Array<String>) {


    val iloscOcen = 2
    val srednia: Double

    println("Podaj ocenę1 ")
    val ocena1: Int = readln().toInt()
    println("Podaj ocenę2 ")
    val ocena2: Int = readln().toInt()
    srednia = (ocena1 + ocena2).toDouble() / iloscOcen



    val napis: String


   napis = if (srednia > 4) {
       "Dobrze $srednia"
    } else {
        "Niedobrze! $srednia \n \"Musisz się poprawić\""

    }
    println(napis)
}
