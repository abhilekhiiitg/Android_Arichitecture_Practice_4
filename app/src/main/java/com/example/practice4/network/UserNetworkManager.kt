package com.example.practice4.network

import com.example.practice4.model.User
import io.reactivex.Single
import retrofit2.Response
import javax.inject.Inject

class UserNetworkManager @Inject constructor(
    private val githubApiService: IGithubApiService
) : IUserNetworkManager {
    override fun fetchUserInfoById(id: Int): Single<Response<User>> {
        return githubApiService.getUser(id)
    }
}