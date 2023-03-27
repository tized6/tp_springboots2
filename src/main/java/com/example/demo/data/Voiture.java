package com.example.demo.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voiture {
    int id;
    String marque;
    int prx;


    public Voiture(String m, int p){
        this.marque = m;
        this.prx = p;
    }

    public Voiture() {
    }

    public String getMarque(){
        return this.marque;
    }
    public void setMarque(String s){
        this.marque = s;
    }

    public int getPrix() {
        return this.prx;
    }

    public void setPrix(int prix) {
        this.prx = prix;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
