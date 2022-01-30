package com.example.roomdatabase_stevdza.fragment.add

import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.roomdatabase_stevdza.data.User
import com.example.roomdatabase_stevdza.data.UserViewModel
import com.example.roomdatabase_stevdza.databinding.FragmentAddBinding

class AddFragment : Fragment() {
    private lateinit var mUserViewModel: UserViewModel
    private lateinit var _binding: FragmentAddBinding
    private val binding get() = _binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddBinding.inflate(inflater, container, false)
        binding.btnAdd.setOnClickListener {
            if (inputCheck(binding.edtFirstName.text.toString(), binding.edtLastName.text.toString(), binding.edtAge.text)) {
                mUserViewModel.addUser(User(0, binding.edtFirstName.text.toString(), binding.edtLastName.text.toString(), Integer.parseInt(binding.edtAge.toString())))
                Toast.makeText(requireContext(), "Successfully added!", Toast.LENGTH_LONG).show()
                //findNavController().navigate(R.id.action_addFragment_to_listFragment)
            }
        }
        return binding.root
    }

    private fun inputCheck(firstName: String, lastName: String, age: Editable): Boolean {
        return !(TextUtils.isEmpty(firstName) && TextUtils.isEmpty(lastName) && age.isEmpty())
    }
}