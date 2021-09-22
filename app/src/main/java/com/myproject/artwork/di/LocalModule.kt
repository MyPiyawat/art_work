package com.myproject.artwork.di

import android.app.Application
import androidx.room.Room
import com.myproject.artwork.data.local.ArtworkDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val databaseModule = module {
    fun provideDatabase(application: Application) =
        Room.databaseBuilder(application, ArtworkDatabase::class.java, "artwork")
            .fallbackToDestructiveMigration().build()

    fun provideArtworkDao(database: ArtworkDatabase) = database.artworkDao

    single { provideDatabase(androidApplication()) }
    single { provideArtworkDao(get()) }
}


