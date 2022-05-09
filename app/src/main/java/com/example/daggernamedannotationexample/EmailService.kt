package com.example.daggernamedannotationexample
import android.annotation.SuppressLint
import android.util.Log
import com.example.daggernamedannotationexample.Utils.Companion.TAG
import javax.inject.Inject

interface NotificationService{
    fun send(from:String, to:String, emailBody:String)
}
class EmailService @Inject constructor():NotificationService{

    @SuppressLint("LongLogTag")
    override fun send(from:String, to:String, emailBody:String){
        Log.e(TAG,"Email sent")
    }
}

class MessageService :NotificationService{

    @SuppressLint("LongLogTag")
    override fun send(from:String, to:String, emailBody:String){
        Log.e(TAG,"Message sent")
    }
}