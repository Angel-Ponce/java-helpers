package Clases; //Change the default package


/* 
	You need a mysql-connector-java-5.1.49-bin.jar  to import:
	(view at https://github.com/Angel-Ponce/java-helpers/tree/main/jars/mysql/mysql-connector)
*/
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.File;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * Create a easy connection to mysql using an object of this class
 * @author Angel
 */
public class Connecter {

    public static final String URL = ""; //URL connection
    public static final String user = ""; //User of database
    public static final String password = ""; //Password of user database
    public PreparedStatement ps; //Object to create a statments with a database
    public ResultSet rs; //Object to capture a results from statments
    public Connection conexion = null; //Object to connect

    /**
	 * Use to get a connection
     *
     * @return Connection object to use
     */
    public Connection getConexion() {
        Connection conection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conection = (Connection) DriverManager.getConnection(URL, user, password);
        } catch (Exception ex) {
            System.err.println("An error was ocurred: " + ex);
        }
        return conection;
    }
}
