package com.behzad.viewmodel

import android.app.Application
import androidx.room.Room
import com.behzad.data.local.AppDatabase

class MyApplication : Application() {

    lateinit var database: AppDatabase

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "app-database"
        ).build()
    }
}