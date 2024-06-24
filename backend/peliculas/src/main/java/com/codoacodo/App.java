package com.codoacodo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.codoacodo.db.conectorDB;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            Statement st= conectorDB.getSt();
           ResultSet rs= st.executeQuery("Select * from peliculas");
           while(rs.next()){
            System.out.println(rs.getString("titulo"));
           }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
