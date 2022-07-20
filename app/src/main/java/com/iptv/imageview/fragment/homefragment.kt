package com.iptv.imageview.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.iptv.imageview.R
import com.iptv.imageview.adapter.plantadapter

class homefragment:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        val view=inflater?.inflate(R.layout.fragment_home,container,false)

        val horizontalview=view?.findViewById<RecyclerView>(R.id.horizontal_reczcler)
        horizontalview?.adapter=plantadapter()
        return view
    }
}