package com.example.gcr.models;
import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
@Data
@Entity
public class Recuperacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Recuperacion() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
