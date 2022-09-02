package com.driver.ebook.model
import com.squareup.moshi.Json

data class AllUsers(
    @Json(name ="error")
    val error: Boolean,
    @Json(name ="users")
    val usersDetails: List<UserDetails>
)