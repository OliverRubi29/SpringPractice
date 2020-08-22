package com.kuwago.demo.service;

import com.kuwago.demo.model.Note;
import com.kuwago.demo.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class NoteServiceImpl implements NoteService {

    private final NoteRepository noteRepository;

    @Autowired
    public NoteServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public Note addNote(Note note) {
        note.setId(UUID.randomUUID());
        return noteRepository.save(note);
    }

    @Override
    public List<Note> getAllNotes() {
        List<Note> notes = new ArrayList<Note>();
        noteRepository.findAll().forEach(notes::add);
        return notes;
    }

    @Override
    public Optional<Note> getNoteById(UUID id) {
        return noteRepository.findById(id);
    }

    @Override
    public void deleteNoteById(UUID id) {
        noteRepository.deleteById(id);
    }

    @Override
    public Note updateNote(UUID id, Note update) {
        Optional<Note> toUpdate = getNoteById(id);
        return toUpdate.map(note -> {
                    note.setTitle(update.getTitle());
                    note.setText(update.getText());
                    return noteRepository.save(note);
        }
        ).orElseGet(null);
    }
}
