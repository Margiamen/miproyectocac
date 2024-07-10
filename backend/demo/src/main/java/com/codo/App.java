package com.codo;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.codo.dao.PeliculaDAO;
import com.codo.model.pelicula;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )    {
        
        try {
            PeliculaDAO peliculaDAO=new PeliculaDAO();
            List<pelicula>listPeli=peliculaDAO.listar();
             for (pelicula peli : listPeli){
                System.out.println(peli.getId()+"-"+peli.getTitulo());
             }

        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
};