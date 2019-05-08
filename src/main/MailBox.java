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
public class MailBox {
     private HashMap<String, Persona>correos;
    
    public  void crearMail(MailBox buzon,Persona remitente,Persona destinatario){
         Mail correo= new Mail(remitente,destinatario);
         this.correos.put(buzon.getRemitente().getNombre(), remitente);
         this.correos.put(buzon.getDestinatario().getNombre(),destinatario);
     }
   
public MailBox(){
    
}
    
}
