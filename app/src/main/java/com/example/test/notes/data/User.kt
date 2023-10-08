package com.example.test.notes.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val fname: String,
    val lname: String,
    val age: Int,
)
