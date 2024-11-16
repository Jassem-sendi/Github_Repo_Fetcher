package com.example.githubfetchdata.data.model

import kotlinx.serialization.Serializable


@Serializable
data class RepoItem(
    val created_at: String ,
    val html_url: String ,
    val language: String ,
    val name: String ,
    val pushed_at: String ,
    val updated_at: String
)