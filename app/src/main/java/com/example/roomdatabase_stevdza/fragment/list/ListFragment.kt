package com.example.roomdatabase_stevdza.fragment.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.roomdatabase_stevdza.R
import com.example.roomdatabase_stevdza.viewmodel.UserViewModel
import com.example.roomdatabase_stevdza.databinding.FragmentListBinding

class ListFragment : Fragment() {
    private lateinit var mUserViewModel: UserViewModel
    private lateinit var _binding: FragmentListBinding
    private val binding get() = _binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentListBinding.inflate(inflater, container, false)

        val adapter = ListAdapter() //must declare
        // UserViewModel
        mUserViewModel = ViewModelProvider(this)[UserViewModel::class.java]
        mUserViewModel.readAllData.observe(viewLifecycleOwner) { user ->
            adapter.setData(user)
        }

        // Recyclerview
        binding.recyclerview.adapter = adapter
        binding.recyclerview.layoutManager = LinearLayoutManager(requireContext())
        binding.floatingActionButton.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_addFragment)
        }

        return binding.root
    }

}