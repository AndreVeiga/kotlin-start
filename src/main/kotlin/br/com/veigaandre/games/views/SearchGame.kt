package br.com.veigaandre.games.views

import br.com.veigaandre.games.dtos.Game
import br.com.veigaandre.games.services.ConsumerApi
import java.util.*

class SearchGame {
    fun execute(): Game? {
        val read = Scanner(System.`in`)
        println("Código do jogo (id):")
        val id = read.nextLine()

        var game: Game? = null

        val result = runCatching {
            val infoGame = ConsumerApi().getGame(id)
            game = Game(infoGame.info.title, infoGame.info.thumb)
        }

        result.onFailure {
            println("Game não encontrado, tente novamente.")
        }

        result.onSuccess {
            println(game)
        }

        return game
    }
}