package com.kuwago.demo.repository;

import com.kuwago.demo.model.Note;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


public interface NoteRepository extends CassandraRepository<Note, UUID> {

    List<Note> findByTitleContaining(String title);

}
