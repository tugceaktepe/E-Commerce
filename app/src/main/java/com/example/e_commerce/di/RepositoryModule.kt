package com.example.e_commerce.di

import com.example.e_commerce.data.model.User
import com.example.e_commerce.data.repos.ProfileRepository
import com.example.e_commerce.data.repos.UserRepository
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideUserRepo(firebaseAuth: FirebaseAuth,fireStore : FirebaseFirestore) : UserRepository = UserRepository(firebaseAuth,fireStore)

    @Provides
    @Singleton
    fun provideProfileRepo(firebaseAuth: FirebaseAuth,fireStore: FirebaseFirestore) : ProfileRepository = ProfileRepository(firebaseAuth,fireStore)
}