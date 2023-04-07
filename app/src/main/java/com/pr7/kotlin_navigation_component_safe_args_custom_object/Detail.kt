package com.pr7.kotlin_navigation_component_safe_args_custom_object

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs


class Detail : Fragment() {

 val args:DetailArgs by navArgs()
 //val args2:DetailArgs by navArgs<DetailArgs>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_detail, container, false)
        val textview: TextView =view.findViewById(R.id.textview2)

        textview.text=args.user.name
        textview.setOnClickListener {
            findNavController().navigate(R.id.action_detail_to_home)
        }
        return view
    }


}