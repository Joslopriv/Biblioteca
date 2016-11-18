package biblioteca.model.sqlControl;

import biblioteca.model.odt.Book;
import java.sql.ResultSet;

public class BookSqlControl extends SqlControl {

    @Override
    public int update(Object obj) {
        Book book = (Book) obj;
        String sql = "update libros set titulo='" + book.getTitle() + "', autor='"
                + book.getAuthor() + "', editorial='" + book.getEditorial()
                + "', asignaruta='" + book.getSubject() + "', estado='" + book.getCondition()
                + "' where codigo=" + book.getCode();
        return connectionDDBB.executeUpdate(sql);
    }

    @Override
    public int insert(Object obj) {
        Book book = (Book) obj;
        String sql = "insert into libros(titulo, autor, editorial, asignatura, estado) values('"
                + book.getTitle() + "','" + book.getAuthor() + "','" + book.getEditorial()
                + "','" + book.getSubject() + "','" + book.getCondition() + "');";
        return connectionDDBB.executeUpdate(sql);
    }

    @Override
    public int delete(Object obj) {
        Book book = (Book) obj;
        String sql = "delete from libros where codigo = " + book.getCode();
        return connectionDDBB.executeUpdate(sql);
    }

    @Override
    public ResultSet selectAll() {
        String sql = "select * from libros;";
        return connectionDDBB.executeQuery(sql);
    }

    @Override
    public ResultSet selectForColumnValue(String nameColumn, String value) {
        String sql = "select * from libros where " + nameColumn + " like ";
        if (nameColumn.equalsIgnoreCase("codigo")) {
            sql += "'" + value + "%';";
        } else {
            sql += "'%" + value + "%';";
        }
        return connectionDDBB.executeQuery(sql);
    }
}
