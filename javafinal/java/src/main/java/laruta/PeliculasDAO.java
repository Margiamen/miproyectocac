// package laruta;
//
//CRUDDDDDDDDDDDDDDDDDDDDDD:
//FALTA VER EL UPDATE, DELETE Y CREATE
// Algo que esta roto en este archivo
// import java.sql.*;

// public class PeliculasDAO {
//     private Connection conn;

//     public PeliculaDAO() throws PostgreSQLConnector {
//         conn = PostgreSQLConnector.getConnection();
//     }

//     // Create (Insertar una nueva película)
//     public void crearPelicula(String titulo, int anio, float puntuacion, String tipo, int categoriaId, String portada) throws SQLException {
//         String sql = "INSERT INTO Pelicula (titulo, anio, puntuacion, tipo, categoria_id, portada) VALUES (?, ?, ?, ?, ?, ?)";

//         try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
//             pstmt.setString(1, titulo);
//             pstmt.setInt(2, anio);
//             pstmt.setFloat(3, puntuacion);
//             pstmt.setString(4, tipo);
//             pstmt.setInt(5, categoriaId);
//             pstmt.setString(6, portada);

//             pstmt.executeUpdate();
//             System.out.println("Pelicula creada exitosamente.");
//         }
//     }

//     // Read (Leer todas las películas)
//     public void listarPeliculas() throws SQLException {
//         String sql = "SELECT * FROM Pelicula";

//         try (Statement stmt = conn.createStatement();
//              ResultSet rs = stmt.executeQuery(sql)) {

//             while (rs.next()) {
//                 int id = rs.getInt("id");
//                 String titulo = rs.getString("titulo");
//                 int anio = rs.getInt("anio");
//                 float puntuacion = rs.getFloat("puntuacion");
//                 String tipo = rs.getString("tipo");
//                 int categoriaId = rs.getInt("categoria_id");
//                 String portada = rs.getString("portada");

//                 System.out.println(String.format("ID: %d, Título: %s, Año: %d, Puntuación: %.1f, Tipo: %s, Categoría ID: %d, Portada: %s",
//                         id, titulo, anio, puntuacion, tipo, categoriaId, portada));
//             }
//         }
//     }

//     // Update (Actualizar una película por ID)
//     public void actualizarPelicula(int id, String titulo, float puntuacion) throws SQLException {
//         String sql = "UPDATE Pelicula SET titulo = ?, puntuacion = ? WHERE id = ?";

//         try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
//             pstmt.setString(1, titulo);
//             pstmt.setFloat(2, puntuacion);
//             pstmt.setInt(3, id);

//             int rowsAffected = pstmt.executeUpdate();
//             if (rowsAffected > 0) {
//                 System.out.println("Pelicula actualizada exitosamente.");
//             } else {
//                 System.out.println("No se encontró la película con ID: " + id);
//             }
//         }
//     }

//     // Delete (Eliminar una película por ID)
//     public void eliminarPelicula(int id) throws SQLException {
//         String sql = "DELETE FROM Pelicula WHERE id = ?";

//         try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
//             pstmt.setInt(1, id);

//             int rowsAffected = pstmt.executeUpdate();
//             if (rowsAffected > 0) {
//                 System.out.println("Pelicula eliminada exitosamente.");
//             } else {
//                 System.out.println("No se encontró la película con ID: " + id);
//             }
//         }
//     }

//     // Cerrar la conexión
//     public void cerrarConexion() throws SQLException {
//         if (conn != null && !conn.isClosed()) {
//             conn.close();
//         }
//     }

//     // Ejemplo de uso
//     public static void main(String[] args) {
//         try {
//             PeliculasDAO peliculaDAO = new PeliculasDAO();

//             // Ejemplo de crear una película
//             peliculaDAO.crearPelicula("Nueva Película", 2024, 4.5f, "pelicula", 1, "http://url-de-la-imagen");

//             // Ejemplo de listar todas las películas
//             peliculaDAO.listarPeliculas();

//             // Ejemplo de actualizar una película
//             peliculaDAO.actualizarPelicula(1, "Nueva Título", 4.0f);

//             // Ejemplo de eliminar una película
//             peliculaDAO.eliminarPelicula(1);

//             // Cerrar la conexión
//             peliculaDAO.cerrarConexion();
//         } catch (SQLException e) {
//             System.out.println("Error en la conexión a la base de datos: " + e.getMessage());
//         }
//     }
// }

