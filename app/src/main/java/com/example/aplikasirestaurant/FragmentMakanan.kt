package com.example.aplikasirestaurant

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.aplikasirestaurant.databinding.ActivityMainBinding
import com.example.aplikasirestaurant.databinding.FragmentMakananBinding


class FragmentMakanan : Fragment() {

    private lateinit var binding: FragmentMakananBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_makanan, container, false)
        val btnNasigoreng : Button = view.findViewById(R.id.btnNasigoreng)

        btnNasigoreng.setOnClickListener {
            val fragment = DetailNasigoreng()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_host_fragment,fragment)?.commit()
        }
        return view
//        return inflater.inflate(R.layout.fragment_makanan, container, false)
    }

}