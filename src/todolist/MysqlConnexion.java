/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Administrator
 */
public class MysqlConnexion {
    static Connection conn=null;
    static String database="todo";
    static String user="root";
    static String pwd="";
    
    static{
        
       try{
            
        Class.forName("com.mysql.cj.jdbc.Driver");
      
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database,user,pwd);
        
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public static Connection getConnection(){
        return conn;
}
}
