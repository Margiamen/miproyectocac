package com.codoacodo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conectorDB {
    private static Connection conn ;
    private static Statement st;
    
    public static void main(String[] args) {

        // Conexión a la base de datos
        try {
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/peli24119","root","");

             st=conn.createStatement();
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConn(){
        return conn;
    }

    public static Statement getSt(){
        return st;
    }

};