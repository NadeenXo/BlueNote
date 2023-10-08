package com.example.test.notes.data

import androidx.lifecycle.LiveData

class UserRepository(val userDAO: UserDAO) {
    suspend fun addUser(user: User){
        userDAO.addUser(user)
    }

    val readAllData: LiveData<List<User>> = userDAO.readAllData()
}