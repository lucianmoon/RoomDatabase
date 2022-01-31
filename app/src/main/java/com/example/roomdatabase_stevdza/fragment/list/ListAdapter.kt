package com.example.roomdatabase_stevdza.fragment.list

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.roomdatabase_stevdza.model.User
import com.example.roomdatabase_stevdza.databinding.CustomRowBinding


class ListAdapter : RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    private var userList = emptyList<User>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.MyViewHolder {
        return MyViewHolder(CustomRowBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ListAdapter.MyViewHolder, position: Int) {
        with(holder) {
            binding.tvId.text = userList[position].id.toString()
            binding.tvFirstName.text = userList[position].firstName
            binding.lastNameTxt.text = userList[position].lastName
            binding.ageTxt.text = userList[position].age.toString()
        }
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    inner class MyViewHolder(val binding: CustomRowBinding) : RecyclerView.ViewHolder(binding.root)

    @SuppressLint("NotifyDataSetChanged")
    fun setData(user: List<User>) {
        this.userList = user
        notifyDataSetChanged()
    }
}