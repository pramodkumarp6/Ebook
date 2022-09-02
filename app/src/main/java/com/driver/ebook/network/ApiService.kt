package com.driver.ebook.network

import com.driver.ebook.model.AllUsers
import com.driver.ebook.model.User
import com.driver.ebook.model.UserCreate
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @POST("userlogin")
    suspend fun UserLogin(): User

    @POST("createuser")
    suspend fun createUser(): UserCreate


    @GET("simple/public/allusers")
    suspend fun getUser():List<AllUsers>


}