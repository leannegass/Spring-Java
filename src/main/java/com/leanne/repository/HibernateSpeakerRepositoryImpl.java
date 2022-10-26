package com.leanne.repository;

import com.leanne.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Leanne");
        speaker.setLastName("Gass");

        speakers.add(speaker);

        return speakers;

    }
}
