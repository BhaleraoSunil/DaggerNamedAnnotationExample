package com.example.daggernamedannotationexample


import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {
 /*
   //way 1
   *//* @Provides
    fun getMessageService():NotificationService{
        return MessageService()
    }*//*

    *//*
    * If we provide Notification Servcice dependency using multiple ways then dagger ggenerates error like:
    * error: [Dagger/DuplicateBindings] com.daggerprovidesmodulebindsexample.NotificationService is bound multiple times
    * So we need to either provide only one type binding  dependency or need to use named annotations.
    * For now we only use one  type binding & will comment above
    * *//*

    //way 2
    @Provides
    fun getEmailService(emailService: EmailService):NotificationService{
        return emailService
    }
    */
    /*
    -Now suppose we want to use both message service and email service runtime.
    -Using above approach we can't achive our new requirement.
    -So we will use @Named() annototation, which help us to achive new feature.

    */

    //example of named annotation

    @Named("message")   // we need to use exact name at consumer side
    @Provides
    fun getMessageService():NotificationService{
        return MessageService()
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService):NotificationService{
        return emailService
    }
}