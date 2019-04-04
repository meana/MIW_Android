package com.danimeana.weatherapp

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

private const val TAG = "MainActivity"
private const val REQUEST_CALENDAR_PERMISSIONS = 1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "Paso por onCreate")
        checkCalendarPermission()
    }

    private fun checkCalendarPermission() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.WRITE_CALENDAR
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(
                    this,
                    Manifest.permission.WRITE_CALENDAR
                )
            ) {
                // Se entra si el usuario no aceptó el permiso anteriormente.
                // Mostrar información al usuario de porqué es necesario el permiso.
            }
            ActivityCompat.requestPermissions(
                this, arrayOf(Manifest.permission.WRITE_CALENDAR),
                REQUEST_CALENDAR_PERMISSIONS
            )
        } else {
            performActionWithTheCalendar()
        }

    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            REQUEST_CALENDAR_PERMISSIONS -> {
                if (grantResults.isNotEmpty()
                    && grantResults[0] == PackageManager.PERMISSION_GRANTED
                ) {
                    // El permiso se ha dado y se puede hacer la tarea oportuna con el calendario.
                    performActionWithTheCalendar()
                } else {
                    // El permiso no se ha dado. Deshabilitamos la funcionalidad que dependa de él.
                }
            }
        }
    }

    private fun performActionWithTheCalendar() {}

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
