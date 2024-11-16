package com.example.githubfetchdata.domain


import com.example.githubfetchdata.data.model.User

interface UserRepository {
   suspend  fun getUserData(userName: String): User
}