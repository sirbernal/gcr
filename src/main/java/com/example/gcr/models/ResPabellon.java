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
    private boolean estado;
    private String motivo;

    public ResPabellon() {
    }
    public ResPabellon(ResId resId,Long id_paciente,Long id_equipo,boolean estado,String motivo){
        this.resId=resId;
        this.id_paciente=id_paciente;
        this.id_equipo=id_equipo;
        this.estado=estado;
        this.motivo=motivo;
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

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResPabellon that = (ResPabellon) o;
        return estado == that.estado &&
                resId.equals(that.resId) &&
                Objects.equals(id_paciente, that.id_paciente) &&
                Objects.equals(id_equipo, that.id_equipo) &&
                Objects.equals(motivo, that.motivo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resId, id_paciente, id_equipo, estado, motivo);
    }
}
