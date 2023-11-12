package br.com.veigaandre.games.main

import br.com.veigaandre.games.views.CreateGamer
import br.com.veigaandre.games.views.SearchGame
import java.util.*

fun main(args: Array<String>) {
    val gamer = CreateGamer().execute()
    val searchGame = SearchGame()

    val read = Scanner(System.`in`)
    var response = ""

    do {

        val game = searchGame.execute()

        println("Deseja buscar outro jogo? [S/N]")
        response = read.nextLine()
    } while (response.equals("s", true))
}
