/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_connection;


import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connection {
     public static void main(String[] args) {
	DB_Connection obj_DB_Connection=new DB_Connection();
	Connection connection=null;
	connection=obj_DB_Connection.get_connection();
	System.out.println(connection);
     }
     public Connection get_connection()
        {
	Connection connection=null;
        try {
                Class.forName("com.mysql.jdbc.Driver");
                connection=DriverManager.getConnection("relationsdatabas","sysdba","masterkey");
	}
        catch (Exception e) {
		System.out.println(e);
	}
	return connection;
     }
}
