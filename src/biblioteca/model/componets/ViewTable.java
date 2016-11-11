package biblioteca.model.componets;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;

public class ViewTable extends AbstractTableModel {

    ResultSet query;
    ResultSetMetaData queryData;
    int numColumn;
    int numRow;

    public ViewTable(ResultSet query) {
        this.query = query;
        try {
            queryData = query.getMetaData();
            query.last();
            numRow = query.getRow();
            numColumn = queryData.getColumnCount();

        } catch (SQLException e) {
        }
    }

    @Override
    public int getRowCount() {
        return numRow;
    }

    @Override
    public int getColumnCount() {
        return numColumn;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            query.absolute(rowIndex + 1);
            Object o = query.getObject(columnIndex + 1);
            return o;
        } catch (SQLException ex) {
            return ex.toString();
        }
    }
}
