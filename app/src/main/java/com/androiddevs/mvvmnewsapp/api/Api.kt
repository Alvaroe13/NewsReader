package com.androiddevs.mvvmnewsapp.api

import com.androiddevs.mvvmnewsapp.models.ResponseApi
import com.androiddevs.mvvmnewsapp.utils.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    //NOTE: suspend function since we're gonna work with coroutines


    //fetch info related to the US
    @GET("v2/top-headlines")
    suspend fun fetchBreakingNews( @Query ("country") countryCode: String,
                                   @Query("page") pageNumber: Int,
                                   @Query("apiKey") apiKey: String = API_KEY ) : Response<ResponseApi>



    //fetch news from all around the world
    @GET("v2/everything")
    suspend fun fetchAllNews( @Query ("q") search: String,
                                   @Query("page") pageNumber: Int,
                                   @Query("apiKey") apiKey: String = API_KEY ) : Response<ResponseApi>



}