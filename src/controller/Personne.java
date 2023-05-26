/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 *
 * @author ROG
 */
public class Personne {
    private int id;
    private String name;
    private String firstname;
    private String num_cin;
    private String date_naissance;
    private String poste;
    private String adresse;
    private String num_tel;
    private InputStream photo;

    public Personne() {
    }

    public Personne(int id, String name, String firstname, String cin, String date, String post, String adresse, String numTel, String path) throws FileNotFoundException {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
        this.date_naissance = date;
        this.num_cin = cin;
        this.poste = post;
        this.adresse = adresse;
        this.num_tel = numTel;
        this.photo =  new FileInputStream(new File(path));
        
    }

    public Personne(String name, String firstname, String cin, String date, String post, String adresse, String numTel, String path) throws FileNotFoundException {
        this.name = name;
        this.firstname = firstname;
        this.date_naissance = date;
        this.num_cin = cin;
        this.poste = post;
        this.adresse = adresse;
        this.num_tel = numTel;
        this.photo =  new FileInputStream(new File(path));
    }
    public Personne(String name, String firstname, String cin, String date, String post, String adresse, String numTel) throws FileNotFoundException {
        this.name = name;
        this.firstname = firstname;
        this.date_naissance = date;
        this.num_cin = cin;
        this.poste = post;
        this.adresse = adresse;
        this.num_tel = numTel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    //Getter for all datas
    public String getDateNaisse() {
        return date_naissance;
    }
    public String getcin() {
        return num_cin;
    }
    public String getPoste() {
        return poste;
    }
    public String getAdresse() {
        return adresse;
    }
    public String getNumTel() {
        return num_tel;
    }
    public InputStream getPhoto() {
        return photo;
    }
    
}

