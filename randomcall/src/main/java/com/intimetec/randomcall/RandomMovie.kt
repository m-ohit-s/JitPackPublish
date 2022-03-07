package com.intimetec.randomcall

class RandomAnime {
    private val anime = arrayListOf("One Piece", "Naruto", "Dragon Ball Z", "Gintama", "Hunter X Hunter")
    public fun randomCall(): String = anime.random()
}