package biblioteca.model.sqlControl;

import biblioteca.model.odt.Student;
import java.sql.ResultSet;

public class StudentSqlControl extends SqlControl {

    @Override
    public int update(Object obj) {
        Student student = (Student) obj;
        String sql = "update alumnos set dni='" + student.getDni() + "', nombre='"
                + student.getName() + "', apellido1='" + student.getSubname1()
                + "', apellido2='" + student.getSubname2() + "' where registro="
                + student.getRegister();
        return connectionDDBB.executeUpdate(sql);
    }

    @Override
    public int insert(Object obj) {
        Student student = (Student) obj;
        String sql = "insert into alumnos(dni, nombre, apellido1, apellido2) values('"
                + student.getDni() + "','" + student.getName() + "','" + student.getSubname1()
                + "','" + student.getSubname2() + "');";
        return connectionDDBB.executeUpdate(sql);
    }

    @Override
    public int delete(Object obj) {
        Student student = (Student) obj;
        String sql = "delete from alumnos where registro = " + student.getRegister();
        return connectionDDBB.executeUpdate(sql);
    }

    @Override
    public ResultSet selectAll() {
        String sql = "select * from alumnos;";
        return connectionDDBB.executeQuery(sql);
    }

    @Override
    public ResultSet selectForColumnValue(String nameColumn, String value) {
        String sql = "select * from alumnos where " + nameColumn + " like ";
        if (nameColumn.equalsIgnoreCase("registro")) {
            sql += "'" + value + "%';";
        } else {
            sql += "'%" + value + "%';";
        }
        return connectionDDBB.executeQuery(sql);
    }
}
