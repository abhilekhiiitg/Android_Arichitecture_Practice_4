package com.example.practice4.network

import com.example.practice4.model.User
import io.reactivex.Single
import retrofit2.Response

interface IUserNetworkManager {
    fun fetchUserInfoById(id:Int): Single<Response<User>>
}
