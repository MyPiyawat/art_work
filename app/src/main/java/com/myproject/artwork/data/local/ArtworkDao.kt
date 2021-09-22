package com.myproject.artwork.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.myproject.artwork.data.model.ArtworkModel

@Dao
interface ArtworkDao {

    @Query("SELECT * FROM artwork")
    fun getAllArtwork(): List<ArtworkModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addAllArtwork(artworks : List<ArtworkModel>)
}