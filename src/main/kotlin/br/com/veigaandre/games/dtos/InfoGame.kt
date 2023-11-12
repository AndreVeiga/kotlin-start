package br.com.veigaandre.games.dtos
data class InfoGame (val info: InfoGameApiShark) {
    override fun toString(): String {
        return info.toString()
    }
}