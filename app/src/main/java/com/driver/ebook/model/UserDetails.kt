package com.driver.ebook.model

import com.squareup.moshi.Json

data class UserDetails( @Json(name ="email")
                        val email: String,
                        @Json(name="id")
                        val id: Int,
                        @Json(name="name")
                        val name: String,
                        @Json(name="school")
                        val school: String)
