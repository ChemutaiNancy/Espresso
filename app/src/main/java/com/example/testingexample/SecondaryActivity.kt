package com.example.testingexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_secondary.*

class SecondaryActivity : AppCompatActivity() {
    /*tools:context=".SecondaryActivity"*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        button_backActivity.setOnClickListener {
            finish()

            // or onBackPressed() - preferred for multiple pages
        }
    }
}
