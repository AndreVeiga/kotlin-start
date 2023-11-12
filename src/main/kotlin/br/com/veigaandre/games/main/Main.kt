package br.com.veigaandre.games.main

import br.com.veigaandre.games.dtos.Game
import br.com.veigaandre.games.services.ConsumerApi
import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    println("Code from game (id):")
    val id = read.nextLine()

    var game: Game? = null

    val result = runCatching {
        val infoGame = ConsumerApi().getGame(id)
        game = Game(infoGame.info.title, infoGame.info.thumb)
    }

    result.onFailure {
        println("Game not found, try again.")
    }

    result.onSuccess {
        println("want add a description on game? [Y/N]")
        val option = read.nextLine()
        game?.description = game?.title

        when {
            option.equals("Y", true) -> {
                println("Add new description: ")
                game?.description = read.nextLine()
            }
        }

        println(game)
    }

}