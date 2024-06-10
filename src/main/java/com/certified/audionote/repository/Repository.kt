package com.certified.audionote.repository

import com.certified.audionote.database.AudioNotesDAO
import com.certified.audionote.model.Note
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Repository @Inject constructor(private val audioNotesDAO: AudioNotesDAO) {

    val allNotes: Flow<List<Note>?> = audioNotesDAO.getAllNotes()
    suspend fun insertNote(note: Note) = audioNotesDAO.insertNote(note)

    suspend fun updateNote(note: Note) = audioNotesDAO.updateNote(note)

    suspend fun deleteNote(note: Note) = audioNotesDAO.deleteNote(note)

    fun getNote(noteId: Int): Flow<Note> = audioNotesDAO.getNote(noteId)
}