package com.shoppi.app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SplashActivity: AppCompatActivity() {                 //SplashActivity의 onCreate Callback은 앱이 실행되고 SplashActivity가 생성됨을 알려주는 Callback
    override fun onCreate(savedInstanceState: Bundle?) {    //Activity 생성 시점에 Layout을 inflate 하기 위해 onCreate Override
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}