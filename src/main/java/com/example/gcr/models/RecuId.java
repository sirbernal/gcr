package com.example.gcr.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Embeddable
public class RecuId implements Serializable {
    @JsonFormat(pattern="dd-MM-yyyy HH:mm")
    private Date fecha_ingreso;
    @JsonFormat(pattern="dd-MM-yyyy HH:mm")
    private Date fecha_salida;
    private Long id_cama;

    public RecuId(Date fi,Date fs,Long id_cama) {
        this.fecha_ingreso = fi;
        this.fecha_salida = fs;
        this.id_cama = id_cama;
    }
    public RecuId() {
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

    public Long getId_cama() {
        return id_cama;
    }

    public void setId_cama(Long id_cama) {
        this.id_cama = id_cama;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecuId recuId = (RecuId) o;
        return fecha_ingreso.equals(recuId.fecha_ingreso) &&
                fecha_salida.equals(recuId.fecha_salida) &&
                id_cama.equals(recuId.id_cama);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fecha_ingreso, fecha_salida, id_cama);
    }
}
