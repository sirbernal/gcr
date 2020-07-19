package com.example.gcr.models;
import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
@Data
@Entity

public class Sillon implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public Sillon() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
