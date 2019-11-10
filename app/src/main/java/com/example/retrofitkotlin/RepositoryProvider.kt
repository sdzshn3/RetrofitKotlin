package com.example.retrofitkotlin

object RepositoryProvider {
    fun getRepository(retrofitService: RetrofitService): Repository {
        return Repository(retrofitService)
    }
}