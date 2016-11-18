package biblioteca.model.sqlControl;

import biblioteca.model.connection.ConnectionDDBB;
import java.sql.ResultSet;


public abstract class SqlControl {
    
    protected ConnectionDDBB connectionDDBB;
    
    public SqlControl() {
        this.connectionDDBB = ConnectionDDBB.getInstance();
    }
    
    public abstract int update(Object obj);
    public abstract int insert(Object obj);
    public abstract int delete(Object obj);
    public abstract ResultSet selectAll();
    public abstract ResultSet selectForColumnValue(String nameColumn, String value);
    
}
