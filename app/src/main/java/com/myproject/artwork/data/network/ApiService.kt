package com.myproject.artwork.data.network

import com.myproject.artwork.data.model.ArtworkModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("artworks")
    suspend fun getArtworks(@Query("limit")limit :Int) : Response<List<ArtworkModel>>


}