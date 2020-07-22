package com.example.gcr.models;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;
@Data
@Entity
public class Recuperacion implements Serializable {
    @EmbeddedId
    private RecuId recuId;
    private Long id_paciente;
    private boolean estado;

    public Recuperacion() {
    }
    public Recuperacion(RecuId recuId,Long id_paciente,boolean estado){
        this.recuId=recuId;
        this.id_paciente=id_paciente;
        this.estado=estado;
    }

    public RecuId getRecuId() {
        return recuId;
    }

    public void setRecuId(RecuId recuId) {
        this.recuId = recuId;
    }

    public Long getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Long id_paciente) {
        this.id_paciente = id_paciente;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recuperacion that = (Recuperacion) o;
        return recuId.equals(that.recuId) &&
                Objects.equals(id_paciente, that.id_paciente) &&
                Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recuId, id_paciente, estado);
    }
}
