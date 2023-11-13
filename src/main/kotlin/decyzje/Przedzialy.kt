package podstawy.decyzje

import java.util.*


fun main(args: Array<String>) {
    val x: Int
    val y: Int
    y = 0
    val keyboard = Scanner(System.`in`)
    println("Podaj liczbę x :")
    x = keyboard.nextInt()
    if (x in 2..10) {
        println("Sukces! Trafiłeś")
    }
    if (x < 2 || x > 10) {
        println("Nie trafiłeś!")
    }
}

