package src.Herencia.domain;

import java.util.Date;

public class Cliente extends Persona {
    private int idCliente;
    private Date fechaRegistro;
    private boolean isVip;
    private static int contadorCliente;

    public Cliente() {
    }

    public Cliente(String nombre, Date fechaRegistro, boolean isVip) {
        super(nombre);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = new Date();
        this.isVip = isVip;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.isVip;
    }

    public void setVip(boolean isVip) {
        this.isVip = isVip;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", isVip=").append(isVip);
        sb.append(", ").append(super.toString()).append("}");
        sb.append('}');
        return sb.toString();
    }
}
