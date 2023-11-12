package br.com.veigaandre.games.views

import br.com.veigaandre.games.dtos.Gamer
import java.util.Scanner

class CreateGamer {

    fun execute(): Gamer {
        val read = Scanner(System.`in`)
        println("==========================")
        println("Insira seu nome:")
        val name = read.nextLine()
        println("Insira seu email:")
        val email = read.nextLine();

        val gamer = Gamer(name, email)

        println("Insira seu usuario:")
        val user = read.nextLine();

        gamer.let {
            it.user = user
        }

        println("==========================")
        return gamer
    }
}