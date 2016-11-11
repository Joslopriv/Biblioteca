package biblioteca.controller;

import biblioteca.model.manager.StateManager;
import biblioteca.view.Login;
import biblioteca.view.StartMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController implements ActionListener {

    private StateManager stateManager;

    public LoginController(StateManager stateManager) {
        this.stateManager = stateManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Login login = stateManager.getLogin();
        String server = login.getTextServer().getText();
        String user = login.getTextUser().getText();
        String password = new String(login.getTextPassword().getPassword());
        System.out.print(password);
        stateManager.openConnectionDDBB(server, user, password);
        login.dispose();

        stateManager.setStartMenu(new StartMenu());
        stateManager.getStartMenu().setVisible(true);
    }

}
