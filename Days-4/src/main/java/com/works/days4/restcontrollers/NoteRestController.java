package com.works.days4.restcontrollers;

import com.works.days4.entities.Note;
import com.works.days4.services.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class NoteRestController {

    final NoteService noteService;

    @PostMapping("add")
    public Note addNote(@RequestBody Note note) {
        return noteService.add(note);
    }

    @GetMapping("allNote")
    public List<Note> allNote() {
        return noteService.allNote();
    }

    @PostMapping("search")
    public List<Note> search(@RequestBody Note note) {
        return noteService.search(note);
    }

}
