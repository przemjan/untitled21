package podstawy.decyzje

import java.util.*


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    println("Podaj odpowiedz (a,b,c)")
    val answer = scan.nextLine().lowercase(Locale.getDefault())
    val litera = answer[0]
    val liczba = 5
    //val napis = " "

    val napis: String
    napis = when (litera) {
        'a' -> "Styczeń"
        'b' -> "Luty"
        'c' -> "Marzec"
        else -> "Kwiecień"
    }
    println("Miesiąc: $napis")
}

