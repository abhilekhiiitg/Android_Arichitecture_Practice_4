package com.example.practice4.base

import io.reactivex.disposables.CompositeDisposable

interface BaseView

interface BaseState

interface BasePresenter <V : BaseView, S : BaseState>{
    var view: V?
    val disposable: CompositeDisposable

    fun attachView(view: V) {
        this.view = view
    }

    fun detachView() {
        view = null
    }

    fun updateView(state: S)
}