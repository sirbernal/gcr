package com.example.gcr.models;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Embeddable
public class QuimioId implements Serializable {
    private Date fecha_ingreso;
    private Date fecha_salida;
    private Long id_sillon;

    public QuimioId() {
    }
    public QuimioId(Date fi,Date fs,Long id_sillon) {
        this.fecha_ingreso=fi;
        this.fecha_salida=fs;
        this.id_sillon=id_sillon;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Long getId_sillon() {
        return id_sillon;
    }

    public void setId_sillon(Long id_sillon) {
        this.id_sillon = id_sillon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuimioId quimioId = (QuimioId) o;
        return fecha_ingreso.equals(quimioId.fecha_ingreso) &&
                fecha_salida.equals(quimioId.fecha_salida) &&
                id_sillon.equals(quimioId.id_sillon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fecha_ingreso, fecha_salida, id_sillon);
    }
}
