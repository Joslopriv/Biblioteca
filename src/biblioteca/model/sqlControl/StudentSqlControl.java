package biblioteca.model.sqlControl;

import biblioteca.model.connection.ConnectionDDBB;
import biblioteca.model.odt.Student;
import java.sql.ResultSet;

public class StudentSqlControl {

    private ConnectionDDBB connectionDDBB;

    public StudentSqlControl() {
        this.connectionDDBB = ConnectionDDBB.getInstance();
    }

    public int update(Student student) {
        String sql = "update alumnos set dni='" + student.getDni() + "', nombre='"
                + student.getName() + "', apellido1='" + student.getSubname1()
                + "', apellido2='" + student.getSubname2() + "' where registro="
                + student.getRegister();
        return connectionDDBB.executeUpdate(sql);
    }

    public int insert(Student student) {
        String sql = "insert into alumnos(dni, nombre, apellido1, apellido2) values('"
                + student.getDni() + "','" + student.getName() + "','" + student.getSubname1()
                + "','" + student.getSubname2() + "');";
        return connectionDDBB.executeUpdate(sql);
    }

    public int delete(Student student) {
        String sql = "delete from alumnos where registro = " + student.getRegister();
        return connectionDDBB.executeUpdate(sql);
    }

    public ResultSet allStudents() {
        String sql = "select * from alumnos;";
        return connectionDDBB.executeQuery(sql);
    }

    public ResultSet studentsForColumnValue(String column, String value) {
        String sql = "select * from alumnos where " + column + " like ";
        if(column.equalsIgnoreCase("registro")) {
            sql += "'" + value + "%';";
        } else {
            sql += "'%" + value + "%';";
        }
        return connectionDDBB.executeQuery(sql);
    }
}
