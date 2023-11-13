package podstawy.decyzje

import java.util.*


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    println("Podaj odpowiedz (a,b,c)")
    val answer = scan.nextLine().lowercase(Locale.getDefault())
    val litera = answer[0]
    val liczba = 5
    val napis = " "
    when (litera) {
        'a' -> println("Styczeń")
        'b' -> println("Luty")
        'c' -> println("Marzec")
        else -> println("Nieoczekiwany błąd. Kod błędu nieznany")
    }
    println("Za chwilę dalszy ciąg programu...")
}

