package com.mario.aniversary

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

/**
 * Created by mario on 10/30/17.
 */
object TalksDataSource{

    const val JSON_TALKS = "[ { \"date\":\"10:20 \n-\n 11:00\", \"title\":\"Codelab: Introducción a react native\", \"speaker\": { \"name\":\"Mishel Vera\", \"job\":\"Software Engineer en Segundamano\" } }, { \"date\":\"10:20 \n-\n 11:00\", \"title\":\"Codelab: ¡Android es para todos!\", \"speaker\": { \"name\":\"Diego Ramírez\", \"job\":\"Mobile Engineer en Segundamano\" } }, { \"date\":\"11:00 \n-\n 11:40\", \"title\":\"Clean Architecture\", \"speaker\": { \"name\":\"Salvador Maurilio\", \"job\":\"Mobile Engineer en Inventive\" } }, { \"date\":\"11:00 \n-\n 11:40\", \"title\":\"Codelab: Mi primera app en Kotlin\", \"speaker\": { \"name\":\"Pedro Hernández\", \"job\":\"Software Engineer en Bunsan\" } }, { \"date\":\"11:40 \n-\n 12:20\", \"title\":\"Bítacora del capitán android\", \"speaker\": { \"name\":\"Noe Branagan\", \"job\":\"Mobile Engineer en Instacarrot\" } }, { \"date\":\"11:40 \n-\n 12:20\", \"title\":\"Codelab: Introducción a Xamarin\", \"speaker\": { \"name\":\"Humberto Jaimes\", \"job\":\"Microsoft - Xamarin MVP\" } }, { \"date\":\"12:20 \n-\n 13:00\", \"title\":\"Android Good Practices\", \"speaker\": { \"name\":\"Anahí Salgado\", \"job\":\"Teacher en Platzi\" } }, { \"date\":\"12:20 \n-\n 13:00\", \"title\":\"Tackling developers in the heart of testing world\", \"speaker\": { \"name\":\"Erik González\", \"job\":\"Mobile Engineer en Segundamano\" } } ]"

    fun getTalks(): List<Talk> {
        val gson = Gson()
        val listType = object : TypeToken<List<Talk>>() {}.type
        return gson.fromJson<List<Talk>>(TalksDataSource.JSON_TALKS, listType)
    }
}