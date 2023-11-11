import com.google.gson.annotations.SerializedName

data class Game(
    @SerializedName("title")
    val title: String,
    @SerializedName("thumb")
    val thumb: String,
) {
    val description = ""

    override fun toString(): String {
        return " Game: $title \n Description: $description \n Thumb: $thumb"
    }
}