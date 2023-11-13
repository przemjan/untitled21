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
    when (litera) {
        'a' -> napis = "Styczeń"
        'b' -> napis = "Luty"
        'c' -> napis = "Marzec"
        else -> napis = "Kwiecień"
    }
    println("Miesiąc: $napis")
}

