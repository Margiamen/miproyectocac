package com.codo.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.codo.db.ConnectorDB;
import com.codo.model.pelicula;

/**
 * Esta clase agrupa todas la consultas a la tabla peliculas.
 * Consultas, insert, upd, y del
 * 
 */
public class PeliculaDAO {
 
    public List<pelicula> listar() {

        try {
            Statement st=ConnectorDB.getSt();
            ResultSet rs=st.executeQuery("Select * from peliculas");

            List<pelicula> listPeli=new ArrayList<pelicula>();
            while (rs.next()) {
                pelicula peli=new pelicula(rs.getInt("id"),rs.getString("titulo"), rs.getDouble("puntuacion"),rs.getString("portada") );
                listPeli.add(peli);
            }   
            return listPeli;
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
        
    }
}
