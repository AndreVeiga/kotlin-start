package br.com.veigaandre.games.dtos

import com.google.gson.annotations.SerializedName

data class Game(
    @SerializedName("title")
    val title: String,
    @SerializedName("thumb")
    val thumb: String,
) {
    var description: String? = null

    override fun toString(): String {
        return " Game: $title \n Description: $description \n Thumb: $thumb"
    }
}