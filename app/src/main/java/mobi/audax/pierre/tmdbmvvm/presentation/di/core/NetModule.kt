package mobi.audax.pierre.tmdbmvvm.presentation.di.core

import dagger.Module
import dagger.Provides
import mobi.audax.pierre.tmdbmvvm.data.api.TMDBService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetModule(private val baseUrl: String) {
    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit =
        Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(baseUrl)
            .build()

    @Singleton
    @Provides
    fun provideTMDBService(retrofit: Retrofit): TMDBService =
        retrofit.create(TMDBService::class.java)
}