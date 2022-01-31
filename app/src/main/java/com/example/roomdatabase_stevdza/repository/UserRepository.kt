package com.example.roomdatabase_stevdza.repository

import androidx.lifecycle.LiveData
import com.example.roomdatabase_stevdza.data.UserDao
import com.example.roomdatabase_stevdza.model.User

class UserRepository(private val userDao: UserDao) {

    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User){
        userDao.addUser(user)
    }

}