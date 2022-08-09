package com.example.fcm

import android.app.NotificationManager
import android.util.Log
import androidx.core.content.ContextCompat
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage


class MyFirebaseMessagingService : FirebaseMessagingService() {
    private val TAG: String = "Pineapple"
    override fun onNewToken(token: String) {
//        super.onNewToken(token)
        Log.d(TAG, "Refreshed token: $token")
//        sendRegistrationToServer(token)
    }
}