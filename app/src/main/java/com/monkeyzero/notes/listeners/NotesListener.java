package com.monkeyzero.notes.listeners;

import com.monkeyzero.notes.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
