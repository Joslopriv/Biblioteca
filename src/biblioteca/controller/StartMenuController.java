package biblioteca.controller;

import biblioteca.view.StartMenu;
import biblioteca.view.dialog.BookDialog;
import biblioteca.view.dialog.LoanDialog;
import biblioteca.view.dialog.StudentDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartMenuController implements ActionListener {

    private StartMenu startMenu;

    public StartMenuController(StartMenu startMenu) {
        this.startMenu = startMenu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String onButton = e.getActionCommand();
        if (onButton.equalsIgnoreCase("alumnos")) {
            StudentDialog studentDialog = new StudentDialog(startMenu);
            studentDialog.setVisible(true);
        } 
        if (onButton.equalsIgnoreCase("libros")) {
            BookDialog bookDialog = new BookDialog(startMenu);
            bookDialog.setVisible(true);
        } 
        if (onButton.equalsIgnoreCase("prestamos")) {
            LoanDialog loanDialog = new LoanDialog(startMenu);
            loanDialog.setVisible(true);
        } 
        if (onButton.equalsIgnoreCase("informes")) {

        } 
        if(onButton.equalsIgnoreCase("salir")) {
            System.exit(0);
        }
    }

}
