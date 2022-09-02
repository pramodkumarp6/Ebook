package com.driver.ebook.model



import com.squareup.moshi.Json

data class UserCreate(
    @Json(name="error")
    val error: Boolean,
    @Json(name="message")
    val message: String
)