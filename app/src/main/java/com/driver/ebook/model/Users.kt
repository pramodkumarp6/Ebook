package com.driver.ebook.model


import com.google.gson.annotations.SerializedName

data class Users(
    @SerializedName("error")
    val error: Boolean,
    @SerializedName("message")
    val message: String,
    @SerializedName("user")
    val user: User
)