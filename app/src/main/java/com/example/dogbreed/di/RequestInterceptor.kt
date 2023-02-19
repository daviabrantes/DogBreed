package com.example.dogbreed.di

import com.example.dogbreed.util.Constants.Companion.API_KEY
import com.example.dogbreed.util.Constants.Companion.HEADER_HOST
import okhttp3.Interceptor
import okhttp3.Response

class RequestInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        request = request?.newBuilder()
            ?.addHeader("x-rapidapi-host", HEADER_HOST)
            ?.addHeader("x-rapidapi-key", API_KEY)
            ?.build()
        return chain.proceed(request)
    }
}
}