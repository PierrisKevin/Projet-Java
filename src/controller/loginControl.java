/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import connexionDB.ConnexionBase;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class loginControl {
    public ConnexionBase connexion;

    public loginControl() throws Exception {
        connexion = new ConnexionBase();
    }
    public boolean getLogin(String name, String mdp){
        String query = "SELECT mdp,username from parametre WHERE username='"+ name +"' and mdp='"+ mdp +"'";
        System.out.println(query);
        ResultSet rs;
        Boolean response = true;
        try {
            rs = connexion.executeQuery(query);
            rs.next();
            String resp = rs.getString("mdp");
        } catch (Exception ex) {
            response=false;
        }
        return response;
    }
    public void changeParameter(boolean valeur) throws Exception{
        String query = "UPDATE parametre SET secure="+valeur;
        connexion.executeUpdate(query);
    }
    public String[] secureData() throws Exception{
        String data[] = new String[2];
        String query = "SELECT * from parametre";
        ResultSet rs = connexion.executeQuery(query);
        rs.next();
        data[0] = rs.getString("username");
        data[1] = rs.getString("mdp");
        return data;
    }
    public boolean secureOrNo() throws Exception{
        String query ="SELECT *FROM parametre";
        ResultSet rs = connexion.executeQuery(query);
        rs.next();
        boolean result = rs.getBoolean("secure");
        return result;
    }
    public void changeAuth(String name, String mdp) throws Exception{
        String query = "UPDATE parametre set username='"+ name +"', mdp='"+ mdp +"'";
        connexion.executeUpdate(query);
    }

}

