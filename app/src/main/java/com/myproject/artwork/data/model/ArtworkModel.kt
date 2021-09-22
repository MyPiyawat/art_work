package com.myproject.artwork.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "artwork")
data class ArtworkModel(@PrimaryKey(autoGenerate = true) val id: Int)
