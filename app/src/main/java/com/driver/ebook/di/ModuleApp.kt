package com.driver.ebook.di

import com.driver.ebook.network.ApiService
import com.driver.ebook.network.Constants


import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ModuleApp {

    @Provides
    @Singleton
    fun providesMoshi():Moshi = Moshi
        .Builder()
        .add(KotlinJsonAdapterFactory())

        .build()



   fun providesApiMosi(moshi: Moshi):  ApiService =
    Retrofit
        .Builder()
        .run {
            baseUrl(Constants.BASE_URL)
            addConverterFactory(MoshiConverterFactory.create(moshi))
                build()
        }.create(ApiService::class.java)








}
