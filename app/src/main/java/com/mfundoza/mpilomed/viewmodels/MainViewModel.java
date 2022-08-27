package com.mfundoza.mpilomed.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.mfundoza.mpilomed.models.Appointment;

import java.util.List;

public class MainViewModel extends AndroidViewModel {
    private LiveData<List<Appointment>> appointments;

    public MainViewModel(@NonNull Application application) {
        super(application);

        noteRepository = new NoteRepository(application);
        savedNotes = noteRepository.getAllNotes();
    }
}
