package com.kuwago.demo.repository;

import com.kuwago.demo.model.Note;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface NoteRepository extends CassandraRepository<Note, UUID> {

}
