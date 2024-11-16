package com.example.githubfetchdata.domain

import com.example.githubfetchdata.data.model.RepoItem

interface RepoRepository {
   suspend fun getReposData(userName: String): List<RepoItem>
}