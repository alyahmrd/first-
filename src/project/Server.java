/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Eng.Ahmed
 */
public class Server extends Application {
    
    public TextArea textbox= new TextArea();
    int ClientNo=0;
    Connection myConn;
    int LoginPass;
     PreparedStatement pst;
     int CheckBoxFlag;
     Statement Statement;
    
    public void InitializeDB() throws ClassNotFoundException{
        try {
            myConn= DriverManager.getConnection("jdbc:mysql://localhost:3306/java1", "root" ,""); 
           
        
          textbox.appendText("Database has successfully connected" + '\n');
        } catch (SQLException ex) {
           textbox.appendText("Error loading SQL database");
        }
    
}
 public boolean ValidateLogin(String username , String password){
          try {
                            
             Statement = (Statement) myConn.prepareStatement("Select * from person where username=? and password=?");
            pst.setString(1, username); 
            pst.setString(2, password);
             ResultSet rset = pst.executeQuery();
             if(rset.next())             
             {return true;}
             else 
             {return false;}
             
                            
                            
                        } catch (SQLException ex) {
                             textbox.appendText("Error loading user info");
                            return false;
                        }
          
    }
 public void AddUser (String NewuserName , String NewPassword , String NewEmail) throws SQLException {
      String query = " insert into person (username, password, email)"
        + " values (?, ?, ?)";
      
       pst = myConn.prepareStatement(query);
      
      pst.setString(1,NewuserName);
      
      pst.setString(2,NewPassword);
      
      pst.setString(3,NewEmail);
      
      
     pst.execute();
     
 }
    public void UpdateUser(String Username,String NewPassword, String NewEmail) throws SQLException{
        String UpdateQuery4="update person set username='"+Username+"' , password= '"+NewPassword+"', email='"+NewEmail+"'where username='"+Username+"' ";
       pst= myConn.prepareStatement(UpdateQuery4);
       pst.execute();
       JOptionPane.showMessageDialog(null, "Successfully updated client information!");
    }
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
