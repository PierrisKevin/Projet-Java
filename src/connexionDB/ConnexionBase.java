/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ROG
 */
public class ConnexionBase {
    public Connection con;
    public Statement stat;

    public ConnexionBase() throws Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost/personnel_management", "root", "");
	stat = con.createStatement();
    }
    
    //begin of resiltSet
    public ResultSet executeQuery (String query) throws Exception{
        ResultSet res = null;
        res = stat.executeQuery(query);
        return(res);
    }
    //insertion, update, delete
    public int executeUpdate (String query) throws Exception{
        int res=0;
	res=stat.executeUpdate(query);
	return(res);
    }

    public void close() throws Exception{
	stat.close();
	con.close();
    }
}
