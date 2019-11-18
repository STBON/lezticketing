/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez02_oo_ticketing;

/**
 *
 * @author tss
 */
public class Utente {
    private String usr;
private String pwd;
private String nome;
private String cognome;
private String email;

    public Utente(String usr, String pwd, String nome, String cognome, String email) {
        this.usr = usr;
        this.pwd = pwd;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

