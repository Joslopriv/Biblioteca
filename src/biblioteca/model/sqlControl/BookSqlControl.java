package biblioteca.model.sqlControl;

import biblioteca.model.connection.ConnectionDDBB;
import biblioteca.model.odt.Book;

import java.sql.ResultSet;

public class BookSqlControl {

    private ConnectionDDBB connectionDDBB;

    public BookSqlControl() {
        this.connectionDDBB = ConnectionDDBB.getInstance();
    }

    public int update(Book book) {
        String sql = "update libros set titulo='" + book.getTitle() + "', autor='"
                + book.getAuthor() + "', editorial='" + book.getEditorial()
                + "', asignaruta='" + book.getSubject() + "', estado='" + book.getCondition()
                + "' where codigo=" + book.getCode();
        return connectionDDBB.executeUpdate(sql);
    }

    public int insert(Book book) {
        String sql = "insert into libros(titulo, autor, editorial, asignatura, estado) values('"
                + book.getTitle() + "','" + book.getAuthor() + "','" + book.getEditorial()
                + "','" + book.getSubject() + "','" + book.getCondition() + "');";
        return connectionDDBB.executeUpdate(sql);
    }

    public int delete(Book book) {
        String sql = "delete from libros where codigo = " + book.getCode();
        return connectionDDBB.executeUpdate(sql);
    }

    public ResultSet allBooks() {
        String sql = "select * from libros;";
        return connectionDDBB.executeQuery(sql);
    }

    public ResultSet booksForColumnValue(String column, String value) {
        String sql = "select * from libros where " + column + " like ";
        if (column.equalsIgnoreCase("codigo")) {
            sql += "'" + value + "%';";
        } else {
            sql += "'%" + value + "%';";
        }
        return connectionDDBB.executeQuery(sql);
    }
}
