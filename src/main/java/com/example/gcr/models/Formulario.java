package com.example.gcr.models;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;
@Data
@Entity
public class Formulario implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_paciente;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private Date fecha_ingreso;
    private String tipo;
    private String motivo;

    public Formulario() {
    }
    public Formulario (Long id_paciente,Date fi,String tipo, String motivo,boolean estado){
        this.id_paciente=id_paciente;
        this.fecha_ingreso=fi;
        this.tipo=tipo;
        this.motivo=motivo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Long id_paciente) {
        this.id_paciente = id_paciente;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        Formulario that = (Formulario) o;
        return tipo == that.tipo &&
                id.equals(that.id) &&
                id_paciente.equals(that.id_paciente) &&
                fecha_ingreso.equals(that.fecha_ingreso) &&
                motivo.equals(that.motivo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, id_paciente, fecha_ingreso, tipo, motivo);
    }
}
