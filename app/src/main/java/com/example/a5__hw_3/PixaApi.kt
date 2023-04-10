package com.example.a5__hw_3

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PixaApi {

    @GET("api/")
    fun getImage(
        @Query("q") keyWord: String,
        @Query("page") page: Int = 1,
        @Query("per_page") perPage: Int = 5,
        @Query("key") key: String  = "35098483-59518951b9badb45a20ce5115",
    ): Call<PixaModel>
}