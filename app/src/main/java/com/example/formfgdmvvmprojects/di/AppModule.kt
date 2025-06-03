package com.example.formfgdmvvmprojects.di

import android.content.Context
import androidx.room.Room
import com.example.formfgdmvvmprojects.data.AttendanceDao
import com.example.formfgdmvvmprojects.data.AttendanceDatabase
import com.example.formfgdmvvmprojects.repository.AttendanceRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule  {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AttendanceDatabase =
        Room.databaseBuilder(
            context, AttendanceDatabase::class.java,
            "attendance_db"
        ).build()

    @Provides
    fun provideDao(database: AttendanceDatabase): AttendanceDao = database.attendanceDao()

    fun provideRepository(dao: AttendanceDao): AttendanceRepository = AttendanceRepository(dao)


}