package com.example.retrofit20022023

import com.google.gson.annotations.SerializedName

/**
 * Created by pphat on 5/29/2023.
 */
data class Post(
    val userId: Int = 0,
    val id: Int = 0,
    val title: String = "",
    val body: String = ""
)
