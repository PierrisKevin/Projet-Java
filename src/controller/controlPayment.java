package controller;

import connexionDB.ConnexionBase;
import java.sql.ResultSet;

public class controlPayment {
    public ConnexionBase connexion;
    
    public controlPayment() throws Exception {
        connexion = new ConnexionBase();
    }
    public void createPayment(String id_personnel) throws Exception{
        String month[] = {"janvier", "fevrier", "mars", "avril", "mai", "juin", "juillet", "aout", "septembre", "octobre", "novembre", "decembre"};
        for(int i=0;i<month.length;i++){
            String query = "INSERT INTO payment (id_emp, mois) VALUES ("+id_personnel+", '"+ month[i] +"')";
            connexion.executeUpdate(query);
        }
    }
    public int countPay() throws Exception{
        String query = "SELECT count(*) as nombre FROM payment";
        ResultSet rs = connexion.executeQuery(query);
        rs.next();
        int nbr = rs.getInt("nombre");
        return nbr;
    }
    public ResultSet getAllPay() throws Exception{
        String query = "SELECT pay.id, p.nom, p.prenom, p.salaire, pay.status, pay.mois FROM employe as p INNER JOIN payment as pay ON pay.id_emp=p.id";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    public ResultSet filterNoMonth(String valeur) throws Exception{
        String query = "SELECT pay.id, p.nom, p.prenom, p.salaire, pay.status, pay.mois FROM employe as p INNER JOIN payment as pay ON pay.id_emp=p.id WHERE p.nom LIKE '%"+ valeur +"%' OR p.prenom LIKE '%"+ valeur +"%'";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    public ResultSet filterByMounth(String valeur) throws Exception{
        String query = "SELECT pay.id, p.nom, p.prenom, p.salaire, pay.status FROM employe as p INNER JOIN payment as pay ON pay.id_emp=p.id WHERE pay.mois='"+valeur+"'";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    public ResultSet filterWithMonth(String name, String mois) throws Exception{
        String query = "SELECT pay.id, p.nom, p.prenom, p.salaire, pay.status FROM employe as p INNER JOIN payment as pay ON pay.id_emp=p.id WHERE p.nom LIKE '%"+ name +"%' OR p.prenom LIKE '%"+ name +"%' AND pay.mois='"+mois+"'";
        System.out.println(query);
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    
    public void modifyPay(String id) throws Exception{
        String query = "UPDATE payment SET status=true WHERE id="+id;
        connexion.executeUpdate(query);
    }
    public void payAllMonth(String month) throws Exception{
        String query = "UPDATE payment SET status=true WHERE mois='"+month+"'";
        connexion.executeUpdate(query);
    }
    
    public String[] resultPayment(String id) throws Exception{
        String query = "SELECT emp.id,emp.poste, emp.salaire, con.duree FROM employe as emp INNER JOIN payment as pay ON pay.id_emp=emp.id INNER JOIN conge as con ON con.personnel_id = emp.id WHERE pay.id="+id;
        ResultSet rs = connexion.executeQuery(query);
        String result[] = new String[4];
        rs.next();
        result[0]=rs.getString("poste");
        result[1]=rs.getString("salaire");
        result[2]=rs.getString("duree");
        result[3]=rs.getString("id");
        return result;
    }
}
