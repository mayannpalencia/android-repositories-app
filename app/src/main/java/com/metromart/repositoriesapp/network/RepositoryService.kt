package com.metromart.repositoriesapp.network

import retrofit2.http.GET

interface RepositoryService {

    @GET("repositories")
    suspend fun getRepositories(): List<Repository>
}
