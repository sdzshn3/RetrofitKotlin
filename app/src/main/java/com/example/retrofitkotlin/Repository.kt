package com.example.retrofitkotlin

import io.reactivex.Observable

class Repository(private val retrofitService: RetrofitService) {
    fun getResponse(pageNumber: Int): Observable<Response> {
        return retrofitService.getResponse(pageNumber)
    }
}