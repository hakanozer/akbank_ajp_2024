package com.works.days4.repositories;

import com.works.days4.entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Integer> {

    List<Note> findByTitleContainsIgnoreCase(String title);


}
