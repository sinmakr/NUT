package com.example.nut


import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ImageButton
import info.simple.nut.R
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nutButton: ImageButton = findViewById(R.id.sayNutButton)

        nutButton.setOnClickListener {
            var nutSayer = MediaPlayer.create(this, R.raw.male_nut)
            nutSayer.start();
        }
    }
}
