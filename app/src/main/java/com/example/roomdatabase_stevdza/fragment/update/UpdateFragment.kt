package com.example.roomdatabase_stevdza.fragment.update

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.roomdatabase_stevdza.R
import com.example.roomdatabase_stevdza.databinding.FragmentUpdateBinding

class UpdateFragment : Fragment() {
private lateinit var _binding:FragmentUpdateBinding
private val binding get()=_binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding= FragmentUpdateBinding.inflate(inflater,container,false)

        return binding.root
    }
}