package com.ucscisg.contatinerization.backend.repository;

import com.ucscisg.contatinerization.backend.entity.Registrant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RegistrantRepository extends CrudRepository<Registrant, UUID> {
}
