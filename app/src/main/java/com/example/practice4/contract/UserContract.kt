package com.example.practice4.contract

import com.example.practice4.base.BasePresenter
import com.example.practice4.base.BaseState
import com.example.practice4.base.BaseView
import com.example.practice4.model.User

interface IUserView : BaseView {
    fun showUserInfo(userInfo: User?)
}

sealed class UserState : BaseState {
    data class UserInfoFetchState(
        val isLoading: Boolean = false,
        var data: User? = null,
        var error: Throwable? = null,
        var isDataLoaded: Boolean = false
    ) : UserState()

}

interface IUserPresenter : BasePresenter<IUserView, UserState> {
    fun getUserInfo(id: Int)
    fun clearResources()

}

