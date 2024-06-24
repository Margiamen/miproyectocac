package laruta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgreSQLConnector {
    
    public static void main(String[] args) {

        // Conexión a la base de datos
        try {

            // Establecer la conexión
            String url = "jdbc:postgresql://localhost:5432/java24119";
            String user = "postgres";
            String password = "Qwerty1997";

            Connection connection = DriverManager.getConnection(url, user, password);

            // Creación de un statement para ejecutar consultas
            Statement statement = connection.createStatement();

            // Ejecución de la consulta
            ResultSet resultSet = statement.executeQuery("SELECT * FROM pelicula");
            System.out.println("conectado con exito");
            // Procesamiento de los resultados
            while (resultSet.next()) {
                System.out.println("id: " + resultSet.getString("id") + " titulo: " + resultSet.getString("titulo"));
            }

            // Cerrar recursos
            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



// package laruta;

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.Statement;

// public class MySQLconnector {

//     public static void main(String[] args) {

//         // Conexión a la base de datos
//         try {
//             Connection connection = DriverManager.getConnection("jdbc:postgres://localhost:3306/Java24119", "root", "");

//             // Creación de un statement para ejecutar consultas
//             Statement statement = connection.createStatement();

//             // Ejecución de la consulta
//             // en resultset tengo todas las películas traidas desde mysql
//             ResultSet resultSet = statement.executeQuery("SELECT * FROM peliculas");
            

//             // Procesamiento de los resultados
//             while (resultSet.next()) {
//                 System.out.println("id:" +  resultSet.getString("id") + " titulo: " + resultSet.getString("titulo"));
                
//             }
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }