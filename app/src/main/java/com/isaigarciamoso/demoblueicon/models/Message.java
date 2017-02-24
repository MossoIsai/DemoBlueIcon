package com.isaigarciamoso.demoblueicon.models;

/**
 * Created by isaigarciamoso on 24/02/17.
 */

public class Message  {
    private String usuario;
    private String mensaje;
    private String publicacion;
    private String tiempo;

    public Message(String usuario, String mensaje, String publicacion, String tiempo) {
        this.usuario = usuario;
        this.mensaje = mensaje;
        this.publicacion = publicacion;
        this.tiempo = tiempo;
    }

    public Message() {

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
}
