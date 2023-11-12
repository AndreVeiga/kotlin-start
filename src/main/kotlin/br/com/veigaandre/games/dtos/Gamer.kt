package br.com.veigaandre.games.dtos

import kotlin.random.Random

data class Gamer(
    val name: String,
    val email: String
) {
    var dateOfBirth: String? = null
    var user: String? = null
        set(value) {
            field = value
            if(id.isNullOrBlank()) {
                createId()
            }
        }
    var id: String? = null
        private set

    val listaJogos = mutableListOf<Game>();

    init {
        // validate here
    }

    constructor(name: String, email: String, dateOfBirth: String, user: String): this(name, email) {
        this.dateOfBirth = dateOfBirth
        this.user = user
        createId()
    }

    override fun toString(): String {
        return " Nome: $name - Data: $dateOfBirth - Email: $email - ID: $id - User: $user"
    }

    private fun createId() {
        val tag = String.format("%04d", Random.nextInt(1000))
        id = "$user#$tag"
    }
}
