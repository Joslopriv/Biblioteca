package biblioteca.controller.dialogController;

import biblioteca.view.dialog.BookSearcherDialog;
import biblioteca.view.dialog.LoanDialog;
import biblioteca.view.dialog.StudentDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class LoanDialogController extends MouseAdapter implements ActionListener{
    
    private LoanDialog loanDialog;
    
    public LoanDialogController(LoanDialog loanDialog) {
        this.loanDialog = loanDialog;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String onButton = e.getActionCommand();
        if(onButton.equalsIgnoreCase("buscar")) {
            StudentDialog studentDialog = new StudentDialog(loanDialog);
            studentDialog.setVisible(true);
        }
        if(onButton.equalsIgnoreCase("+")) {
            BookSearcherDialog bookSearcher = new BookSearcherDialog(loanDialog);
            bookSearcher.setVisible(true);
        }
        if(onButton.equalsIgnoreCase("editar")) {
            
        }
        if(onButton.equalsIgnoreCase("-")) {
            
        }
        if(onButton.equalsIgnoreCase("salir")) {
            loanDialog.dispose();
        }
    }
    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) { }
    
}
