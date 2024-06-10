package com.certified.audionote.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.certified.audionote.model.Note
import com.certified.audionote.utils.Converters

@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class AudioNotesDatabase : RoomDatabase() {

    abstract fun audioNotesDao(): AudioNotesDAO
}