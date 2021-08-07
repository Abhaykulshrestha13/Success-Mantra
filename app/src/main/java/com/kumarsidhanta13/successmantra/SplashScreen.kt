package com.kumarsidhanta13.successmantra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class SplashScreen : AppCompatActivity() {
    lateinit var logoSplashScreen: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        logoSplashScreen = findViewById(R.id.logo_splash)
        logoSplashScreen.alpha = 0f
        logoSplashScreen.animate().setDuration(1500).alpha(1f).withEndAction{
            startActivity(Intent(this,MainActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }
    }
}