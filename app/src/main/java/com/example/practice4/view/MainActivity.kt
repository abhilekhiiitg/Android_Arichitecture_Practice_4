package com.example.practice4.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.practice4.MainApplication
import com.example.practice4.contract.IUserView
import com.example.practice4.databinding.ActivityMainBinding
import com.example.practice4.model.User
import com.example.practice4.presenter.UserPresenter
import javax.inject.Inject

class MainActivity : IUserView, AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var presenter: UserPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (application as? MainApplication)?.component?.inject(this)
        presenter.attachView(this)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLoad.setOnClickListener { loadUserInfo() }
    }

    override fun showUserInfo(userInfo: User?) {
        binding.tvUsername.text = userInfo?.username + "\n" + userInfo?.email + "\n" + userInfo?.status + "\n" + userInfo?.gender
    }

    private fun loadUserInfo() {
        // https://gorest.co.in/public/v2/users
        presenter.getUserInfo(2953)
    }

}