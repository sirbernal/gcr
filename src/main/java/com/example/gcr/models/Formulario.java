package com.example.gcr.models;
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
    private Date fecha_ingreso;
    private Date fecha_salida;
    private int tipo;
    private String motivo;
    private boolean estado;

    public Formulario() {
    }
    public Formulario (Long id_paciente,Date fi,Date fs,int tipo, String motivo,boolean estado){
        this.id_paciente=id_paciente;
        this.fecha_ingreso=fi;
        this.fecha_salida=fs;
        this.tipo=tipo;
        this.motivo=motivo;
        this.estado=estado;
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

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
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
        Formulario that = (Formulario) o;
        return tipo == that.tipo &&
                estado == that.estado &&
                id.equals(that.id) &&
                id_paciente.equals(that.id_paciente) &&
                fecha_ingreso.equals(that.fecha_ingreso) &&
                fecha_salida.equals(that.fecha_salida) &&
                motivo.equals(that.motivo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, id_paciente, fecha_ingreso, fecha_salida, tipo, motivo, estado);
    }
}
