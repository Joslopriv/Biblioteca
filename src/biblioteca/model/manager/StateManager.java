package biblioteca.model.manager;

import biblioteca.controller.LoginController;
import biblioteca.model.connection.ConnectionDDBB;
import biblioteca.view.Login;
import biblioteca.view.StartMenu;

public class StateManager {

    private Login login;
    private StartMenu startMenu;
    private ConnectionDDBB connectionDDBB;

    public StateManager() {
        this.login = new Login(new LoginController(this));
        this.login.setVisible(true);
    }

    public void openConnectionDDBB(String server, String user, String password) {
        connectionDDBB = ConnectionDDBB.getInstance(server, user, password);
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public StartMenu getStartMenu() {
        return startMenu;
    }

    public void setStartMenu(StartMenu startMenu) {
        this.startMenu = startMenu;
    }

    public ConnectionDDBB getConnectionDDBB() {
        return connectionDDBB;
    }

    public void setConnectionDDBB(ConnectionDDBB connectionDDBB) {
        this.connectionDDBB = connectionDDBB;
    }

}
