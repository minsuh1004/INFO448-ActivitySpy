package edu.uw.ischool.msk812.activityspy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    val tag = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(tag, "onCreate event fired" + savedInstanceState.toString())
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(tag, "onRestart event fired")
    }

    override fun onStart() {
        super.onStart()
        Log.i(tag, "onStart event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i(tag, "onResume event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i(tag, "onPause event fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i(tag, "onStop event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(tag, "onDestroy event fired")
        Log.e(tag, "We're going down, Captain!")
    }
}