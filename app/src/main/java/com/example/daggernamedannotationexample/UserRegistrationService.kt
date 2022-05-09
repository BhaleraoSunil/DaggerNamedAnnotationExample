package com.example.daggernamedannotationexample


import javax.inject.Inject
import javax.inject.Named


class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
//    @Named("message") private val  notificationService: NotificationService
    @Named("email") private val  notificationService: NotificationService
) {


    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password);
        notificationService.send("sunil@gmail.com",email,"Welcome, thanks for registration.")
    }

}