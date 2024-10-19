package com.behzad.data.local

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [UserModel::class], version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun userDao():UserDao
}