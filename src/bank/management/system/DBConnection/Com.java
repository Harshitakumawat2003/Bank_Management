package bank.management.system.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Com {
    Connection connection;
    public Statement statement;
    public Com(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankManagement","root","Harshita@2003");
            statement = connection.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
