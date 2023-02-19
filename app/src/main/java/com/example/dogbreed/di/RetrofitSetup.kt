package com.example.dogbreed.di

import com.example.dogbreed.network.DogBreedApi
import com.example.dogbreed.util.Constants
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitSetup {

    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient().newBuilder()
            .addInterceptor(RequestInterceptor())
            .build()
    }

    fun provideGetService(retrofit: Retrofit): DogBreedApi =
        retrofit.create(DogBreedApi::class.java)
}