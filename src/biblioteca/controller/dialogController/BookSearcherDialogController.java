package biblioteca.controller.dialogController;

import biblioteca.model.odt.Book;
import biblioteca.view.dialog.BookSearcherDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookSearcherDialogController implements ActionListener {

    private BookSearcherDialog bookSearcherDialog;
    
    public BookSearcherDialogController() {
        this.bookSearcherDialog = bookSearcherDialog;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void showBook(Book book) {
        
    }
    
}
