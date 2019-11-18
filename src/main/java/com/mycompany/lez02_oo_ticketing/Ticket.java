/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez02_oo_ticketing;

import java.time.LocalDateTime;

/**
 *
 * @author tss
 */
public class Ticket {
   private float prezzo;
   private LocalDateTime dataBuy;
   //cosa
   private Evento evento;
   //chi
   private Utente utente;
   
    public Ticket(float prezzo, Evento evento, Utente utente) {
        this.prezzo = prezzo;
        this.dataBuy = LocalDateTime.now();
        this.evento = evento;
        this.utente = utente;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public LocalDateTime getDataBuy() {
        return dataBuy;
    }

    public void setDataBuy(LocalDateTime dataBuy) {
        this.dataBuy = dataBuy;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }
   
}
