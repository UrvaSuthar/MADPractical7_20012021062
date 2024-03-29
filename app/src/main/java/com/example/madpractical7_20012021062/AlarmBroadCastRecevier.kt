package com.example.madpractical7_20012021062

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AlarmBroadCastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        val str1 = intent.getStringExtra("Service1")
        if(str1 == "Start" || str1 == "Stop")
        {
            val intentService = Intent(context, AlarmService::class.java)
            intentService.putExtra("Service1", intent.getStringExtra("Service1"))
            if(str1 == "Start")
            {
                context.startService(intentService)
            }
            else if(str1=="Stop") {
                context.stopService(intentService)
            }
        }
    }
}