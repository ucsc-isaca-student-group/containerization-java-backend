package com.ucscisg.contatinerization.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class Registrant {
    @Id
    UUID id;
    String firstName;
    String lastName;
    String nic;
    String mobileNumber;
    String address;

    public Registrant() {
        id = UUID.randomUUID();
    }

    public Registrant(String firstName, String lastName, String nic, String mobileNumber, String address) {
        id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.nic = nic;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }
}
