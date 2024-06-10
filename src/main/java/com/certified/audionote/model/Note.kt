package com.certified.audionote.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.certified.audionote.utils.colors
import com.certified.audionote.utils.currentDate
import com.certified.audionote.utils.formatReminderDate
import kotlinx.parcelize.Parcelize


/**
 * The Note class represent the domain model i.e the
 * object visible to the app user.
 *
 * @param id        id of the note
 * @param title     title of the note
 * @param description      content of the note
 * @param color     color of the note
 * @param lastModificationDate      date the note was created/modified
 * @param audioLength       The length of the audio recording
 * @param size      Basically the size of the audio in MB in the device
 * @param started   whether or note the reminder is active
 * @param reminder  date set for a reminder in the note
 *
 **/
@Parcelize
@Entity(tableName = "notes_table")
data class Note(
    var title: String = formatReminderDate(currentDate().timeInMillis),
    var description: String = "",
    var color: Int = colors.random(),
    var lastModificationDate: Long = currentDate().timeInMillis,
    var size: String = "",
    var audioLength: Long = -1L,
    var filePath: String = "",
    var started: Boolean = false,
    var reminder: Long? = null,
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
) : Parcelable