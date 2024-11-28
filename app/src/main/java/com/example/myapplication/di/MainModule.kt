package com.example.myapplication.di

import android.app.Application
import androidx.room.Room
import com.example.myapplication.db.MainDb
import com.example.myapplication.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MainModule {
    @Provides
    @Singleton
    fun provideMainDb(app: Application): MainDb {
        return Room.databaseBuilder(
            app,
            MainDb::class.java,
            name = Constants.DB_NAME
        ).createFromAsset("db/" + Constants.DB_NAME).build()
    }
}