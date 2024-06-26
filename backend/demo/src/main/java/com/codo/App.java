package com.codo;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.codo.dao.PeliculaDAO;
import com.codo.db.ConnectorDB;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )    {
        
        try {
            PeliculaDAO peliculaDAO=new PeliculaDAO();
            peliculaDAO.listar();

        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}
