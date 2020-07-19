package com.example.gcr.models;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
@Data
@Entity
public class Equipo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public Equipo() {

    }
}
