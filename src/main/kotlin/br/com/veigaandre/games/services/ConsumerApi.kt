package br.com.veigaandre.games.services

import br.com.veigaandre.games.dtos.InfoGame
import com.google.gson.Gson
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

class ConsumerApi {
    fun getGame(id: String): InfoGame {
        val url = "https://www.cheapshark.com/api/1.0/games?id=$id"
        val client = HttpClient.newHttpClient()
        val request = HttpRequest.newBuilder().uri(URI.create(url)).build()

        val response = client.send(request, HttpResponse.BodyHandlers.ofString())

        val gson = Gson()

        return gson.fromJson(response.body(), InfoGame::class.java);
    }
}