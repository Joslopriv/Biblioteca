package biblioteca.model.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionDDBB {

    private Connection connectionDDBB;
    private ResultSet query_result;
    private static ConnectionDDBB myConnectionDDBB;

    public static ConnectionDDBB getInstance() {
        if (myConnectionDDBB == null) {
            myConnectionDDBB = new ConnectionDDBB();
        }
        return myConnectionDDBB;
    }

    private ConnectionDDBB() {

    }

    public static ConnectionDDBB getInstance(String server, String user, String password) {
        if (myConnectionDDBB == null) {
            myConnectionDDBB = new ConnectionDDBB(server, user, password);
        }
        return myConnectionDDBB;
    }

    private ConnectionDDBB(String server, String user, String password) {
        openConnectionDDBB(server, user, password);
    }

    public void openConnectionDDBB(String server, String user, String password) {
        try {
            connectionDDBB = DriverManager.getConnection(server, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDDBB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet executeQuery(String sql) {
        try {
            Statement query = connectionDDBB.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            query_result = query.executeQuery(sql);
            return query_result;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDDBB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public int executeUpdate(String sql) {
        try {
            Statement query = connectionDDBB.createStatement();
            return query.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDDBB.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
}
