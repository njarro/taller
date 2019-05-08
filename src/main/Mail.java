/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Estudiante
 */
import java.util.*;
public class Mail {
   
     private String contenido;
     private Persona remitente;
     private Persona destinatario;

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Persona getRemitente() {
        return remitente;
    }

    public void setRemitente(Persona remitente) {
        this.remitente = remitente;
    }

    public Persona getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Persona destinatario) {
        this.destinatario = destinatario;
    }
        
     public Mail(Persona remitente,Persona destinatario){
         this.destinatario=destinatario;
         this.remitente=remitente;
     }
      
     
}
