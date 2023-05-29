package com.example.retrofit20022023

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by pphat on 5/29/2023.
 */
interface ApiService {

    @GET("posts/1")
    fun getPost1(): Call<Post>
}
