package biblioteca.controller.dialogController;

import biblioteca.model.odt.Book;
import biblioteca.view.dialog.BookDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JTable;

public class BookDialogController extends MouseAdapter implements ActionListener {

    private BookDialog bookDialog;

    public BookDialogController(BookDialog bookDialog) {
        this.bookDialog = bookDialog;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String onButton = e.getActionCommand();
        Book book = createBook();
        if (onButton.equalsIgnoreCase("buscar")) {
            String column = (String) bookDialog.getCbSearchColumn().getSelectedItem();
            String value = bookDialog.getTextSearch().getText();
            bookDialog.updateTableForColumnValue(column, value);
        } else {
            if (onButton.equalsIgnoreCase("modificar")) {
                bookDialog.getBookSql().update(book);
            }
            if (onButton.equalsIgnoreCase("bajas")) {
                bookDialog.getBookSql().delete(book);
            }
            if (onButton.equalsIgnoreCase("altas")) {
                bookDialog.getBookSql().insert(book);
            }
            bookDialog.updateTableAllBooks();
        }
         if (onButton.equalsIgnoreCase("select")) {
            System.out.print("caca");
            bookDialog.dispose();
        }
        if (onButton.equalsIgnoreCase("salir")) {
            bookDialog.dispose();
        }
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        JTable booksTable = bookDialog.getBooksTable();
        int rowSelect = booksTable.getSelectedRow();

        String code = String.valueOf(booksTable.getValueAt(rowSelect, 0));
        String title = String.valueOf(booksTable.getValueAt(rowSelect, 1));
        String author = String.valueOf(booksTable.getValueAt(rowSelect, 2));
        String editorial = String.valueOf(booksTable.getValueAt(rowSelect, 3));
        String subject = String.valueOf(booksTable.getValueAt(rowSelect, 4));
        String condition = String.valueOf(booksTable.getValueAt(rowSelect, 5));

        bookDialog.getTextCode().setText(code);
        bookDialog.getTextTitle().setText(title);
        bookDialog.getTextAuthor().setText(author);
        bookDialog.getTextEditorial().setText(editorial);
        bookDialog.getTextSubject().setText(subject);
        bookDialog.getTextCondition().setText(condition);
    }

    private Book createBook() {
        Book book = new Book();

        String code = bookDialog.getTextCode().getText();
        String title = bookDialog.getTextTitle().getText();
        String author = bookDialog.getTextAuthor().getText();
        String editorial = bookDialog.getTextEditorial().getText();
        String subject = bookDialog.getTextSubject().getText();
        String condition = bookDialog.getTextCondition().getText();

        book.setCode(code);
        book.setTitle(title);
        book.setAuthor(author);
        book.setEditorial(editorial);
        book.setSubject(subject);
        book.setCondition(condition);

        return book;
    }

}
