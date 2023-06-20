package controller;

import connexionDB.ConnexionBase;
import java.sql.ResultSet;

public class controlCOnges {
    public ConnexionBase connexion;

    public controlCOnges() throws Exception {
        connexion = new ConnexionBase();
    }
    public void createConge(String persId) throws Exception{
        String query = "INSERT INTO conge (personnel_id) VALUES (" + persId + ")";
        connexion.executeUpdate(query);
    }
    public String congetReste(String persId) throws Exception{
        String query = "SELECT (duree) as duree FROM conge WHERE personnel_id=" + persId + "";
        ResultSet rs = connexion.executeQuery(query);
        rs.next();
        String duree = rs.getString("duree");
        return duree;
    }
    public void changeConge(String id, String dure) throws Exception{
        String query = "UPDATE conge SET duree=" + dure + " WHERE personnel_id="+ id + "";
        connexion.executeUpdate(query);
    }
    
    // Control des demande
    public void ajoutDemand(String delai, String raison, String persoId, String periode) throws Exception{
        String query = "INSERT INTO demande (delai, raison, personnel_id, periode) VALUE ("+ delai +",'"+ raison +"',"+ persoId +",'"+ periode +"')";
        connexion.executeUpdate(query);
    }
    
    public ResultSet listeDemande() throws Exception{
        String query = "SELECT demande.id, employe.nom, employe.prenom FROM demande INNER JOIN employe ON demande.personnel_id=employe.id;";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    public ResultSet chercheDemande(String valeur) throws Exception{
        String query = "SELECT demande.id, employe.nom, employe.prenom FROM demande INNER JOIN employe ON demande.personnel_id=employe.id WHERE employe.nom LIKE '%"+ valeur +"%' or employe.prenom LIKE '%"+ valeur + "%'";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    public int countConge() throws Exception {
        String query = "SELECT count(*) as nombre FROM demande";
        ResultSet rs = connexion.executeQuery(query);
        rs.next();
        int nbr = rs.getInt("nombre");
        return nbr;
    }
    public String[] getDemande(String id) throws Exception{
        String valeur[] = new String[4]; 
        String query = "SELECT * FROM demande WHERE id="+id+"";
        ResultSet rs = connexion.executeQuery(query);
        rs.next();
        valeur[0] = rs.getString("personnel_id");
        valeur[1] = rs.getString("delai");
        valeur[2] = rs.getString("raison");
        valeur[3] = rs.getString("periode");
        return valeur;
    }
    public int[] statistiqueConge() throws Exception{
        String query = "SELECT count(*) as mois, periode FROM demande GROUP BY periode ORDER BY periode ASC";
        ResultSet rs = connexion.executeQuery(query);
        int valeur[] = new int[12];
        int i = 0;
        while (rs.next()) {
            int indexMonth = findIndex(rs.getString("periode"));
            valeur[indexMonth] = (rs.getInt("mois")*100);
            i++;
            }
        return valeur;
    }
    
    //FOnction not for demand or Conge but for finding index
    public int findIndex(String str){
        String month[] = {"janvier", "fevrier", "mars", "avril", "mai", "juin", "juillet", "aout", "septembre", "octobre", "novembre", "decembre"};
        for(int i=0;i<month.length;i++){
            if(str.equalsIgnoreCase(month[i])) return i;
        }
        return 0;
    }
    
}

