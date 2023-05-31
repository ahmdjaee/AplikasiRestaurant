package com.example.aplikasirestaurant

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.aplikasirestaurant.databinding.ActivityMainBinding
import com.example.aplikasirestaurant.databinding.FragmentMakananBinding


class FragmentMakanan : Fragment() {

//    private lateinit var binding: FragmentMakananBinding
    private var _binding : FragmentMakananBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMakananBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.btnNasigoreng.setOnClickListener{
            findNavController().navigate(R.id.action_fragmentMakanan_to_detailNasigoreng)
        }
        binding.btnBakso.setOnClickListener{
            findNavController().navigate(R.id.action_fragmentMakanan_to_detailBakso)
        }
        binding.btnMieayam.setOnClickListener{
            findNavController().navigate(R.id.action_fragmentMakanan_to_detailMieayam)
        }
        return view
//        return inflater.inflate(R.layout.fragment_makanan, container, false)
    }

}

// Inflate the layout for this fragment
//        val view = inflater.inflate(R.layout.fragment_makanan, container, false)
//        val btnNasigoreng : Button = view.findViewById(R.id.btnNasigoreng)
//
//        btnNasigoreng.setOnClickListener {
//            val fragment = DetailNasigoreng()
//            val transaction = fragmentManager?.beginTransaction()
//            transaction?.replace(R.id.nav_host_fragment,fragment)?.commit()
//        }