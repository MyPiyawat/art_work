package com.myproject.artwork.data.local

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [ArtworkDao::class],version = 1,exportSchema = false)
abstract class ArtworkDatabase : RoomDatabase(){

    abstract val artworkDao : ArtworkDao
}