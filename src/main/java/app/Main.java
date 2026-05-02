package app;

import dao.imp.CourseDAOImpl;
import model.Curso;
import org.bson.types.ObjectId;

/**
 *
 * @author Ricardo
 */
public class Main {
    public static void main(String[] args) {        
        try {
            CourseDAOImpl cursoDAO = new CourseDAOImpl();
            
            // 1. Crear
            Curso nuevoCurso = new Curso();
            nuevoCurso.setTitle("MongoDB para Java Developers");
            nuevoCurso.setDescription("Aprende a integrar MongoDB usando el driver síncrono y POJOs.");
            nuevoCurso.setCategory("Bases de Datos");
            nuevoCurso.setPrice(59.99);
            
            cursoDAO.create(nuevoCurso);
            ObjectId idGenerado = nuevoCurso.getId();
            System.out.println("Curso insertado exitosamente con ID: " + idGenerado);
            
            // 2. Leer por_id
            Curso cursoEncontrado = cursoDAO.findById(idGenerado);
            System.out.println("Encontrado: " + cursoEncontrado.getTitle() + " - " + cursoEncontrado.getDescription());
            
            // 3. Actualizar
            cursoEncontrado.setPrice(39.99);
            cursoEncontrado.setDescription("Aprende a integrar MongoDB. (Precio de promoción)");
            cursoDAO.update(cursoEncontrado);
            
            // 4. Listar todos
            System.out.println("Listando cursos");
            for (Curso c : cursoDAO.findAll()) {
                System.out.println(" -> " + c.getTitle() + " | Precio: $" + c.getPrice() + " | Actualizado: " + c.getUpdatedAt());
            }
            
            // 5. Eliminar por_id
            cursoDAO.deleteById(idGenerado);
            System.out.println("Curso eliminado");

        } catch (Exception e) {
            System.err.println("Error durante la ejecución de pruebas: " + e.getMessage());
        } finally {
            config.MongoClientProvider.getInstance().close();
            System.out.println("\n--- Pruebas finalizadas y conexión cerrada ---");
        }
    }
}