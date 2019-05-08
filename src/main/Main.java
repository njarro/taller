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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Persona p1=new Persona("jorge ",12);
      Persona p2=new Persona("jorge ",12);
      Persona p3=new Persona("jorge ",12);   
      Persona p4=new Persona("jorge ",12);
      Persona p5=new Persona("jorge ",12);
            
      MailBox mailbox=new MailBox();  
      
      mailbox.crearMail(p5, p5);
      mailbox.crearMail(p5, p5);
      mailbox.crearMail(p5, p5);
      mailbox.crearMail(p5, p5);
      mailbox.crearMail(p5, p5);
        
       
    
        
    }
    
   
