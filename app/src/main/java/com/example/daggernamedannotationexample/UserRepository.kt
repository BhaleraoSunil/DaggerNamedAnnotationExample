package com.example.daggernamedannotationexample

import android.annotation.SuppressLint
import android.util.Log
import com.example.daggernamedannotationexample.Utils.Companion.TAG
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email:String,password:String)
}
class SQLRepository @Inject constructor() :UserRepository{

    @SuppressLint("LongLogTag")
    override fun saveUser(email:String, password:String){
        Log.e(TAG,"USer saved in db")
    }
}

class FirebaseRepository  :UserRepository{

    @SuppressLint("LongLogTag")
    override fun saveUser(email:String, password:String){
        Log.e(TAG,"USer saved in firebase")
    }
}