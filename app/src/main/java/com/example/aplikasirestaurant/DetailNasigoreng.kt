package com.example.aplikasirestaurant

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.aplikasirestaurant.databinding.FragmentDetailEstehBinding
import com.example.aplikasirestaurant.databinding.FragmentDetailNasigorengBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DetailNasigoreng.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailNasigoreng : Fragment() {
    private var _binding: FragmentDetailNasigorengBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailNasigorengBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.btnPesanNasi.setOnClickListener {
            findNavController().navigate(R.id.action_detailNasigoreng_to_fragmentPesanan)
        }
        // Inflate the layout for this fragment
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DetailNasigoreng.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic fun newInstance(param1: String, param2: String) =
                DetailNasigoreng().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}