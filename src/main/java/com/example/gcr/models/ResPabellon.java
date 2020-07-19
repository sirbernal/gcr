package com.example.gcr.models;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;
@Data
@Entity
public class ResPabellon implements Serializable {
    @EmbeddedId
    private ResId resId;
    private Long id_paciente;
    private Long id_equipo;
    private String estado;

    public ResPabellon() {
    }
    public ResPabellon(ResId resId,Long id_paciente,Long id_equipo,String estado){
        this.resId=resId;
        this.id_paciente=id_paciente;
        this.id_equipo=id_equipo;
        this.estado=estado;
    }

    public ResId getResId() {
        return resId;
    }

    public void setResId(ResId resId) {
        this.resId = resId;
    }

    public Long getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Long id_paciente) {
        this.id_paciente = id_paciente;
    }

    public Long getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(Long id_equipo) {
        this.id_equipo = id_equipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResPabellon that = (ResPabellon) o;
        return resId.equals(that.resId) &&
                Objects.equals(id_paciente, that.id_paciente) &&
                Objects.equals(id_equipo, that.id_equipo) &&
                Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resId, id_paciente, id_equipo, estado);
    }
}
