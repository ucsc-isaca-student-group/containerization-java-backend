package com.ucscisg.contatinerization.backend.controller;

import com.ucscisg.contatinerization.backend.entity.Registrant;
import com.ucscisg.contatinerization.backend.repository.RegistrantRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/register")
public class RegistrationController {


    RegistrantRepository repository;

    public RegistrationController(RegistrantRepository repository) {
        this.repository = repository;
    }

    public String test() {
        return "Test Success";
    }

    @PutMapping
    public UUID register(@RequestBody Registrant registrant) {
        return repository.save(registrant).getId();
    }

    @GetMapping("/{uuid}")
    public Registrant getRegistrant(@PathVariable UUID uuid) {
        return repository.findById(uuid).get();
    }

    @GetMapping()
    public List<Registrant> getRegistrant() {
        return StreamSupport.stream(repository.findAll().spliterator(), false).collect(Collectors.toList());
    }
}
