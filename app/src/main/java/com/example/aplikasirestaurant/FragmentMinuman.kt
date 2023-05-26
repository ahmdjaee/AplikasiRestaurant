package com.example.aplikasirestaurant

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aplikasirestaurant.databinding.FragmentMinumanBinding


class FragmentMinuman : Fragment() {

    private lateinit var binding: FragmentMinumanBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMinumanBinding.inflate(layoutInflater,container, false)
//        return inflater.inflate(R.layout.fragment_minuman, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Memberikan aksi pada
        binding.btnAirputih.setOnClickListener {
//            val action = FragmentMinumanDirections
//            android:id="@+id/action_fragmentMakanan_to_detailNasigoreng"
//            app:destination="@id/detailNasigoreng"
        }
    }
}