package com.example.yeet.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.yeet.entities.Note;

import java.util.List;

@Dao
public interface NoteDao {

    String n = "notes";
    String id = "id";
    @Query("SELECT * FROM "+ n +" ORDER BY " + id + " DESC")
    List<Note> getAllNotes();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertNote(Note note);

    @Delete
    void deleteNote(Note note);

}
