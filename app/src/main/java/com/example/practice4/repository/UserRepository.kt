package com.example.practice4.repository

import com.example.practice4.network.IUserNetworkManager
import com.example.practice4.model.User
import io.reactivex.Single
import retrofit2.Response
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val  userNetworkManager: IUserNetworkManager
) : IUserRepository {
    override fun getUserInfo(id: Int): Single<Response<User>> {
        return userNetworkManager.fetchUserInfoById(id)
    }
}