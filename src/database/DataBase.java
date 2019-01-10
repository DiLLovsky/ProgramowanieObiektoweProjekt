/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DiLLu
 */
public class DataBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection myconObj = null;
        Statement mystatObj = null;
        ResultSet myresObj = null;
        
        try{
            myconObj = DriverManager.getConnection("jdbc:derby://localhost:1527/MyDataBase", "student", "student");
            mystatObj = myconObj.createStatement();
            myresObj = mystatObj.executeQuery("SELECT * FROM Studenci");
            while(myresObj.next()){
                int id = myresObj.getInt("ID");
                String name = myresObj.getString("Name");
                String surname = myresObj.getString("Surname");
                String phone = myresObj.getString("PhoneNumber");
                System.out.println(id + " " + name + " " + surname + " " + phone);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
}
