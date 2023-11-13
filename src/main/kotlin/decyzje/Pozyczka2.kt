package podstawy.decyzje

import java.util.*


fun main(args: Array<String>) {
    val zarobki: Double
    val staz: Double
    val progZarobki: Double
    val progStaz: Double
    progZarobki = 1000000.0
    progStaz = 10.0
    val scanner = Scanner(System.`in`)
    print("Ile zarabiasz rocznie: ")
    zarobki = scanner.nextDouble()
    scanner.nextLine()
    print("Ile lat pracujesz: ")
    staz = scanner.nextDouble()
    if (zarobki >= progZarobki && staz >= progStaz) {
        print("Gratulacje, dostałeś pożyczkę")
    } else {
        print("Nie ma pożyczki!")
    }
}

