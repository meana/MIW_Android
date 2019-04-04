package com.danimeana.weatherapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        message.text = "Hello Master!!"
        Log.d(TAG, "Paso por onCreate")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Paso por onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Paso por onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Paso por onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Paso por onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Paso por onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Paso por onDestroy")
    }
}
