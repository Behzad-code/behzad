package com.behzad.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "users")
data class UserModel(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val firstName: String,
    val lastName: String
)

