package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {

    String user = "Egor2";
    String password = "Database!2";
    String url = "jdbc:mysql://localhost:3306/Cars";
    private Connection connection;
    private static JDBC instance;



    public Connection getConnection() {
        return connection;
    }



    private JDBC() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(url, user, password);
    }




    public static JDBC getInstance(){
        if(instance==null){
            try {
                instance = new JDBC();
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Error database connection");
                e.printStackTrace();
            }
        }
        return instance;
    }
}
