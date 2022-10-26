package com.leanne.service;

import com.leanne.model.Speaker;
import com.leanne.repository.HibernateSpeakerRepositoryImpl;
import com.leanne.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository;

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
