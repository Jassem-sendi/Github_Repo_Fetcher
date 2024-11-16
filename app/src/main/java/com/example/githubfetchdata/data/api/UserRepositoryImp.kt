package com.example.githubfetchdata.data.api

import com.example.githubfetchdata.data.model.User
import com.example.githubfetchdata.domain.UserRepository
import io.ktor.client.call.body
import io.ktor.client.request.get

class UserRepositoryImpl(private val apiService: Client) : UserRepository {
    override suspend fun getUserData(userName: String): User {
       return apiService.NO_AUTh_CLIENT.get("https://api.github.com/users/$userName").body<User>()
    }

}

