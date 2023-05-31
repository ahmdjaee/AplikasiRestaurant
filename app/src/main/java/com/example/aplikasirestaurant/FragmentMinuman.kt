package com.example.aplikasirestaurant

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.aplikasirestaurant.databinding.FragmentMinumanBinding


class FragmentMinuman : Fragment() {

//    private lateinit var binding: FragmentMinumanBinding
    private var _binding: FragmentMinumanBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMinumanBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.btnAirputih.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMinuman_to_detailAirputih)
        }
        binding.btnEsteh.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMinuman_to_detailEsteh)
        }
        binding.btnEsjeruk.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMinuman_to_detailEsjeruk)
        }
        return view
    }


}