package com.example.githubfetchdata.data.api

import com.example.githubfetchdata.data.model.RepoItem
import com.example.githubfetchdata.data.model.User
import com.example.githubfetchdata.domain.RepoRepository
import com.example.githubfetchdata.domain.UserRepository
import io.ktor.client.call.body
import io.ktor.client.request.get

class RepoRepositoryImpl(private val apiService: Client) : RepoRepository {
    override suspend  fun getReposData(userName: String): List<RepoItem> {
        return apiService.NO_AUTh_CLIENT.get("https://api.github.com/users/$userName/repos").body<List<RepoItem>>()

    }
}

