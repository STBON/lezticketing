/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez02_oo_ticketing;

import java.time.LocalDateTime;
import java.time.Month;

/**
 *
 * @author tss
 */
public class MainStart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Utente utente;
        Evento evento;
        Ticket ticket;
        //creo un utente
        utente= new Utente("poi", "poi", "pippo", "pluto", "pippo@pluto.it");
        //vreo un evento
        LocalDateTime dataevento=LocalDateTime.of(2019, 12,25,20,30);
        evento = new Evento("jovanotti tour", dataevento,"Samone (TO)");
        //creo biglietto
        ticket= new Ticket(20, evento, utente);
                
        System.out.println(ticket.getUtente().getCognome());
        
    }
    
}
