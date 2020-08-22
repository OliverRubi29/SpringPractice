package com.kuwago.demo.service;

import com.kuwago.demo.model.Note;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface NoteService {

    Note addNote(Note note);

    List<Note> getAllNotes();

    Optional<Note> getNoteById(UUID id);

    void deleteNoteById(UUID id);

    Note updateNote(UUID id, Note note);


}
