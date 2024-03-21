package com.works.days4.services;

import com.works.days4.entities.Note;
import com.works.days4.repositories.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NoteService {

    final NoteRepository noteRepository;

    public Note add(Note note) {
        // insert into note values(default, ?, ?)
        noteRepository.save(note);
        return note;
    }


}
