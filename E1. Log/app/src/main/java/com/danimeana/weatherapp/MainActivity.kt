package com.danimeana.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        message.text = "Hello Master!!"
        Log.e(TAG, "Mensaje de error")
        Log.w(TAG, "Mensaje de advertencia")
        Log.i(TAG, "Mensaje de información")
        Log.d(TAG, "Mensaje de depuración")
        Log.v(TAG, "Mensaje de detalle")

        try {
            throw NullPointerException("Excepción de pruebas")
        } catch (e: NullPointerException) {
            Log.e(TAG, "Excepción", e)
        }

    }
}
