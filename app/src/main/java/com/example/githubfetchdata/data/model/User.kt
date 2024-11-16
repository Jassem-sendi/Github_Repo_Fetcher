package com.example.githubfetchdata.data.model

import kotlinx.serialization.Serializable

@Serializable

data class User(
    val avatar_url: String ,
    val company: String ,
    val created_at: String ,
    val url : String ,
    val repos_url: String ,
    val followers: Int ,
    val following: Int ,
    val location: String ,
    val name: String ,
)