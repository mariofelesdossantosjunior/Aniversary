package com.mario.aniversary

/**
 * Created by mario on 10/30/17.
 */
data class Talk(val date: String = "30/Set/2017", val title: String, val speaker: Speaker)
data class Speaker(val name : String, val job: String = "Android Developer")