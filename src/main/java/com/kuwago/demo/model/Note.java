package com.kuwago.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;


import java.sql.Timestamp;
import java.util.UUID;

@Table
@Data
@RequiredArgsConstructor
public class Note {

    @PrimaryKey
    private UUID id;

    private String title;

    private String text;

    private Timestamp timestamp;


}
