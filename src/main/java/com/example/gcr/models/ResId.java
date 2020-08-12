package com.example.gcr.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Embeddable
public class ResId implements Serializable {
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private Date fecha_ingreso;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private Date fecha_salida;
    private Long id_pabellon;

    public ResId(Date fi,Date fs, Long id_pabellon) {
        this.fecha_ingreso = fi;
        this.fecha_salida = fs;
        this.id_pabellon = id_pabellon;
    }
    public ResId() {
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

    public Long getId_pabellon() {
        return id_pabellon;
    }

    public void setId_pabellon(Long id_pabellon) {
        this.id_pabellon = id_pabellon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResId resId = (ResId) o;
        return fecha_ingreso.equals(resId.fecha_ingreso) &&
                fecha_salida.equals(resId.fecha_salida) &&
                id_pabellon.equals(resId.id_pabellon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fecha_ingreso, fecha_salida, id_pabellon);
    }
}
