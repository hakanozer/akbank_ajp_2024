package com.works.days4.restcontrollers;

import com.works.days4.entities.Note;
import com.works.days4.services.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NoteRestController {

    final NoteService noteService;

    @PostMapping("add")
    public Note addNote(@RequestBody Note note) {
        return noteService.add(note);
    }

}
