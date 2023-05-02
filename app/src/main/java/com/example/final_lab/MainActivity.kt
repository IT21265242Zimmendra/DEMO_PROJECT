package com.example.final_lab

import android.annotation.SuppressLint
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var myBroadcastReceiver: MyReceiver
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.button)

        var tv = findViewById<TextView>(R.id.textView)

        var txt = "Hello User!"

        btn.setOnClickListener{
           tv.text = txt

        }
     myBroadcastReceiver = MyReceiver()
        //
        val filter = IntentFilter("android.intent.action.BATTERY_LOW")
        val listenToBroadcastsFromOtherApps = false
        val receiverFlags = if(listenToBroadcastsFromOtherApps){
            ContextCompat.RECEIVER_EXPORTED
        } else {
            ContextCompat.RECEIVER_NOT_EXPORTED
        }
        ContextCompat.registerReceiver(this,myBroadcastReceiver,filter,receiverFlags)
        val systemFilter = IntentFilter()
        systemFilter.addAction(Intent.ACTION_SCREEN_OFF)
        systemFilter.addAction(Intent.ACTION_SCREEN_ON)
        systemFilter.addAction(Intent.ACTION_BATTERY_LOW)
        GlobalScope.launch {
            delay(5000)
            val intent = Intent()
            intent.action = "com.example.final_lab.MY_CUSTOM_ACTION"
            sendBroadcast(intent)
        }
    }

}