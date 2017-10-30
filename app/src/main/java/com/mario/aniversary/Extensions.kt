package com.mario.aniversary

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by mario on 10/30/17.
 */
fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    val inflater = LayoutInflater.from(this.context)
    return inflater.inflate(layoutId, this, attachToRoot)
}