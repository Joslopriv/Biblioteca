package biblioteca;

import biblioteca.model.manager.StateManager;

/**
 * @author Joshua López Rivero
 */
public class Biblioteca {

    public static void main(String[] args) {
        StateManager m = new StateManager();
    }
    /*
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Biblioteca", "root", "");
        JasperReport reporte = (JasperReport) JRLoader.loadObject(new File("AllStudents.jasper"));
        JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, conexion);
    }
     */

}
