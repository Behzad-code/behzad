package com.behzad.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query


@Dao
interface UserDao {


    @Insert
    suspend fun insertUser(user:UserModel)

    @Query("SELECT * FROM USERS  ")
    suspend fun getAllUser():List<UserModel>

    @Delete
    suspend fun deleteUser(user: UserModel)
}