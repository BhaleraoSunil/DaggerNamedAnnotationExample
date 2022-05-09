package com.example.daggernamedannotationexample

import dagger.Component

@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun inject(activity: MainActivity)
}