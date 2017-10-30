package com.mario.aniversary

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_talk.view.*

class TalksAdapter(val talks: MutableList<Talk>) : RecyclerView.Adapter<TalksAdapter.TalkViewHolder>() {

    override fun getItemCount(): Int {
        return talks.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): TalkViewHolder? {
        val itemView = parent?.inflate(R.layout.item_talk)
        return TalkViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TalkViewHolder?, position: Int) {
        val talk = talks[position]
        holder?.bindTalk(talk)
    }

    class TalkViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        fun bindTalk(talk: Talk) {
            itemView?.let {
                with(itemView) {
                    labelDate?.text = talk.date
                    labelTitle?.text = talk.title
                    labelName?.text = talk.speaker.name
                    labelJob?.text = talk.speaker.job
                }
            }
        }
    }
}