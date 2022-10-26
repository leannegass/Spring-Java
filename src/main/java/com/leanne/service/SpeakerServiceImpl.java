package com.leanne.service;

import com.leanne.model.Speaker;
import com.leanne.repository.HibernateSpeakerRepositoryImpl;
import com.leanne.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
