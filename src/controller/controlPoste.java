package controller;

import connexionDB.ConnexionBase;
import java.sql.ResultSet;

public class controlPoste {
    
    private ConnexionBase connexion;
    
    public controlPoste() throws Exception {
        connexion = new ConnexionBase();
    }
    
    public ResultSet getAllPoste() throws Exception{
        String query = "SELECT * FROM list_poste";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    public int countPoste() throws Exception{
        String query = "SELECT count(*) as nombre FROM list_poste";
        ResultSet rs = connexion.executeQuery(query);
        rs.next();
        int nbr = rs.getInt("nombre");
        return nbr;
    }
    
    public void insertPoste(String nomPoste, String salaire, String salaireJ) throws Exception {
        String req = "INSERT INTO list_poste (nom_poste, salaire, salaire_journalier) VALUES ('"+ nomPoste +"',"+"'"+ salaire +"',"+ salaireJ +")";
        connexion.executeUpdate(req);
    }
    public void changePoste(String nom, String salaire, String salaireJ) throws Exception{
        String query = "UPDATE list_poste SET salaire='"+ salaire +"' salaire_journalier="+ salaireJ +" WHERE nom='"+ nom +"'";
        connexion.executeUpdate(query);
    }
}
