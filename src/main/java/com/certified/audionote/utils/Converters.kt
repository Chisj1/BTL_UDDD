package com.certified.audionote.utils

import androidx.room.TypeConverter
import java.util.Date

class Converters {
    @TypeConverter
    fun fromTimeStamp(value: Long) = Date(value)

    @TypeConverter
    fun dateToTimeStamp(date: Date) = date.time
}