package com.example.retrofitkotlin

import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*

interface RetrofitService {

    @GET("api/users?page=1")
    fun getResponse(@Query("page") pageNumber: Int): Observable<Response>
    
    companion object Factory {
        fun create(): RetrofitService {
            val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://reqres.in/")
                .build()

            return retrofit.create(RetrofitService::class.java)
        }
    }
}