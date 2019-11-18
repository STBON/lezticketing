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
public class Evento {
    private String titolo;
    private LocalDateTime dataEvento;
    private String luogo;

    public Evento(String titolo, LocalDateTime dataEvento, String luogo) {
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.luogo = luogo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDateTime getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDateTime dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }
    
}
