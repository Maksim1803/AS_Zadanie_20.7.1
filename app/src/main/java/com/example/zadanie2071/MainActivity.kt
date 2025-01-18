package com.example.zadanie2071

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    }
    fun onClickToast(view: View) {
        Toast.makeText(this, "Я буду android-разработчиком!", Toast.LENGTH_SHORT).show()
    }

    fun onClickToast2(view: View) {
        Toast.makeText(this, "Я таки буду android-разработчиком!", Toast.LENGTH_LONG).show()
    }
}
