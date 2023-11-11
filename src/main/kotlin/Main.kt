import com.google.gson.Gson
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    println("Code from game (id):")
    val id = read.nextLine()

    val url = "https://www.cheapshark.com/api/1.0/games?id=$id"
    val client = HttpClient.newHttpClient()
    val request = HttpRequest.newBuilder().uri(URI.create(url)).build()

    val response = client.send(request, HttpResponse.BodyHandlers.ofString())

    val gson = Gson()
    val infoGameApiShark = gson.fromJson(response.body(), InfoGame::class.java)

    val game = Game(infoGameApiShark.info.title, infoGameApiShark.info.thumb)

    println(game)
}