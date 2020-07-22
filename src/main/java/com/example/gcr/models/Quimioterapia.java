package com.example.gcr.models;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;
@Data
@Entity
public class Quimioterapia implements Serializable {
    @EmbeddedId
    private QuimioId quimioId;
    private Long id_paciente;
    private boolean estado;

    public Quimioterapia() {
    }
    public Quimioterapia(QuimioId quimioId,Long id_paciente,boolean estado) {
        this.quimioId=quimioId;
        this.id_paciente=id_paciente;
        this.estado=estado;
    }

    public QuimioId getQuimioId() {
        return quimioId;
    }

    public void setQuimioId(QuimioId quimioId) {
        this.quimioId = quimioId;
    }

    public Long getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Long id_paciente) {
        this.id_paciente = id_paciente;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quimioterapia that = (Quimioterapia) o;
        return quimioId.equals(that.quimioId) &&
                Objects.equals(id_paciente, that.id_paciente) &&
                Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quimioId, id_paciente, estado);
    }
}
