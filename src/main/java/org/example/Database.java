package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
private static Database INSTANCE;
   private Connection connection;
   private Database(){

       try {
           String url="jdbc:postgresql://localhost:32768/modul1";
           String login="postgres";
           String password="1111";
           connection = DriverManager.getConnection(url,login,password);
   }catch (SQLException e){
e.printStackTrace();
       }
}
public static Database getINSTANCE(){
       if(INSTANCE==null){
           synchronized (Database.class){
               if (INSTANCE==null){
               INSTANCE= new Database();
               }
           }
       }
       return INSTANCE;
}
public Connection getConnection(){
       return connection;
}
}



