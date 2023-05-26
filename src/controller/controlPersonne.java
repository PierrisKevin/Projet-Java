/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import connexionDB.ConnexionBase;
import java.sql.ResultSet;

/**
 *
 * @author ordi
 */
public class controlPersonne {

    public ConnexionBase connexion;

    public controlPersonne() throws Exception {
        connexion = new ConnexionBase();
    }

    public void insert(Personne obj) throws Exception {
        String req = "INSERT INTO employe(nom,prenom,date_naissance, Num_cin, Poste, num_tel,adresse) VALUES('" + obj.getName() + "','" + obj.getFirstname() + "','"+ obj.getDateNaisse() + "',"+ obj.getcin() + ",'" + obj.getPoste() + "'," + obj.getNumTel() +",'"+ obj.getAdresse()+"')";
        System.out.println(req);
        connexion.executeUpdate(req);
    }

    public void update(String id, Personne obj) throws Exception {
        String query = "UPDATE employe SET nom='" + obj.getName() + "',prenom='" + obj.getFirstname() + "',Date_naissance='"+ obj.getDateNaisse() + "',Num_cin='"+ obj.getcin() + "',poste='" + obj.getPoste() +  "',adresse='"+ obj.getAdresse() +"' WHERE id=" + id + "";
        System.out.println(query);
        connexion.executeUpdate(query);
    }
    public void virtualDelete(String id) throws Exception{
        String query = "UPDATE employe SET visible=0 where id="+id+"";
        connexion.executeUpdate(query);
    }
    public void delete(String id) throws Exception {
        String query = "DELETE FROM employe WHERE id=" + id + "";
        System.out.println(query);
        connexion.executeUpdate(query);
    }

    public ResultSet getAll() throws Exception {
        String query = "SELECT * FROM employe WHERE visible=1";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    public ResultSet getAllDel() throws Exception {
        String query = "SELECT * FROM employe WHERE visible=0";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    public ResultSet searchAll(String str) throws Exception{
        String query = "SELECT * FROM employe WHERE (Nom LIKE '%"+ str +"%' or Prenom LIKE '%"+ str +"%') AND visible=1";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    
    public void restore(String id) throws Exception{
        String query = "UPDATE employe SET visible=1 where id="+id+"";
        connexion.executeUpdate(query);
    }
    public void videCorbeille() throws Exception{
        String query = "DELETE FROM employe WHERE visible=0";
        connexion.executeUpdate(query);
    }
    
    public String[] getPersonnal(String id) throws Exception{
        String valeur[] = {"","","","","","","","",""}; 
        String query = "SELECT * FROM employe WHERE id="+id+"";
        ResultSet rs = connexion.executeQuery(query);
        rs.next();
        valeur[0] = rs.getString("id");
        valeur[1] = rs.getString("Nom");
        valeur[2] = rs.getString("Prenom");
        valeur[3] = rs.getString("Date_naissance");
        valeur[4] = rs.getString("Poste");
        valeur[5] = rs.getString("num_tel");
        valeur[6] = rs.getString("Num_cin");
        valeur[7] = rs.getString("adresse");
        valeur[8] = rs.getString("QRCode");
        return valeur;
    }
    public String takeLast() throws Exception{
        String query = "SELECT (id) as idenitifiant FROM employe ORDER BY id DESC LIMIT 1";
        ResultSet rs = connexion.executeQuery(query);
        rs.next();
        String id = rs.getString("idenitifiant");
        return id;
    }
    public void SetQR(String path, String id) throws Exception{
        String query = "UPDATE employe SET QRCode='"+ path +"' WHERE id="+ id +"";
        connexion.executeUpdate(query);
    }
    
    public int countEnreg() throws Exception {
        String query = "SELECT count(*) as nombre FROM employe";
        ResultSet rs = connexion.executeQuery(query);
        rs.next();
        int nbr = rs.getInt("nombre");
        return nbr;
    }
    
    public int countConge() throws Exception {
        String query = "SELECT count(*) as nombre FROM conge";
        ResultSet rs = connexion.executeQuery(query);
        rs.next();
        int nbr = rs.getInt("nombre");
        return nbr;
    }
    

}
