package com.codo.dao;

import java.sql.ResultSet;
import java.sql.Statement;

import com.codo.db.ConnectorDB;

/**
 * Esta clase agrupa todas la consultas a la tabla peliculas.
 * Consultas, insert, upd, y del
 * 
 */
public class PeliculaDAO {
 
    public void listar() {

        try {
            Statement st=ConnectorDB.getSt();
            ResultSet rs=st.executeQuery("Select * from peliculas");
            while (rs.next()) {
                System.out.println(rs.getString("titulo"));
            }            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
