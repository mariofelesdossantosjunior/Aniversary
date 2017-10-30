package com.mario.aniversary

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_talks.*

class FragmentTalks : Fragment(){

    val adapter by lazy {
        val talks = TalksDataSource.getTalks()
        val immutableList = mutableListOf<Talk>()
        immutableList.addAll(talks)

        TalksAdapter(immutableList)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view : View? = container?.inflate(R.layout.fragment_talks)
        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listTalks.layoutManager = LinearLayoutManager(context)
        listTalks.setHasFixedSize(true)
        listTalks.adapter = adapter
    }
}