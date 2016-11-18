package biblioteca.view.dialog;

import biblioteca.controller.dialogController.BookDialogController;
import biblioteca.model.componets.ViewTable;
import biblioteca.model.sqlControl.BookSqlControl;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

public class BookDialog extends javax.swing.JDialog {

    private BookSqlControl bookSql;
    private ViewTable viewTable;

    public BookDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public BookDialog(java.awt.Frame parent) {
        super(parent, true);
        initComponents();
        this.btnSelect.setEnabled(false);
        this.bookSql = new BookSqlControl();

        this.viewTable = new ViewTable(bookSql.selectAll());
        this.booksTable.setModel(this.viewTable);

        this.componentsAddListener();
    }

    public BookDialog(javax.swing.JDialog parent) {
        super(parent, true);
        initComponents();
        this.btnUpdate.setEnabled(false);
        this.btnInsert.setEnabled(false);
        this.btnDelete.setEnabled(false);
        this.bookSql = new BookSqlControl();

        this.viewTable = new ViewTable(bookSql.selectAll());
        this.booksTable.setModel(this.viewTable);

        this.componentsAddListener();
    }

    private void componentsAddListener() {
        BookDialogController bookDialogController = new BookDialogController(this);
        this.btnSearch.addActionListener(bookDialogController);
        this.btnUpdate.addActionListener(bookDialogController);
        this.btnDelete.addActionListener(bookDialogController);
        this.btnInsert.addActionListener(bookDialogController);
        this.btnSelect.addActionListener(bookDialogController);
        this.btnExit.addActionListener(bookDialogController);

        this.booksTable.addMouseListener(bookDialogController);
    }

    public BookSqlControl getBookSql() {
        return bookSql;
    }

    public void setBookSql(BookSqlControl bookSql) {
        this.bookSql = bookSql;
    }

    public JTable getBooksTable() {
        return booksTable;
    }

    public void setBooksTable(JTable booksTable) {
        this.booksTable = booksTable;
    }

    public JTextField getTextAuthor() {
        return textAuthor;
    }

    public void setTextAuthor(JTextField textAuthor) {
        this.textAuthor = textAuthor;
    }

    public JTextField getTextCode() {
        return textCode;
    }

    public void setTextCode(JTextField textCode) {
        this.textCode = textCode;
    }

    public JTextField getTextCondition() {
        return textCondition;
    }

    public void setTextCondition(JTextField textCondition) {
        this.textCondition = textCondition;
    }

    public JTextField getTextEditorial() {
        return textEditorial;
    }

    public void setTextEditorial(JTextField textEditorial) {
        this.textEditorial = textEditorial;
    }

    public JTextField getTextSubject() {
        return textSubject;
    }

    public void setTextSubject(JTextField textSubject) {
        this.textSubject = textSubject;
    }

    public JTextField getTextTitle() {
        return textTitle;
    }

    public void setTextTitle(JTextField textTitle) {
        this.textTitle = textTitle;
    }

    public JComboBox<String> getCbSearchColumn() {
        return cbSearchColumn;
    }

    public void setCbSearchColumn(JComboBox<String> cbSearchColumn) {
        this.cbSearchColumn = cbSearchColumn;
    }

    public JTextField getTextSearch() {
        return textSearch;
    }

    public void setTextSearch(JTextField textSearch) {
        this.textSearch = textSearch;
    }

    public void updateTableAllBooks() {
        this.viewTable = new ViewTable(bookSql.selectAll());
        this.booksTable.setModel(this.viewTable);
    }

    public void updateTableForColumnValue(String column, String value) {
        this.viewTable = new ViewTable(bookSql.selectForColumnValue(column, value));
        this.booksTable.setModel(this.viewTable);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        booksTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lbCode = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        lbAuthor = new javax.swing.JLabel();
        lbEditorial = new javax.swing.JLabel();
        lbSubject = new javax.swing.JLabel();
        lbCondition = new javax.swing.JLabel();
        textCode = new javax.swing.JTextField();
        textEditorial = new javax.swing.JTextField();
        textCondition = new javax.swing.JTextField();
        textAuthor = new javax.swing.JTextField();
        textSubject = new javax.swing.JTextField();
        textTitle = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnSelect = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cbSearchColumn = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        textSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        booksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(booksTable);

        lbCode.setText("Codigo");

        lbTitle.setText("Titulo");

        lbAuthor.setText("Autor");

        lbEditorial.setText("Editorial");

        lbSubject.setText("Asignatura");

        lbCondition.setText("Estado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCode, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCode))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitle)
                    .addComponent(textTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAuthor)
                    .addComponent(textAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEditorial)
                    .addComponent(textEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSubject)
                    .addComponent(textSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCondition))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCode)
                    .addComponent(lbTitle)
                    .addComponent(lbAuthor)
                    .addComponent(lbEditorial)
                    .addComponent(lbSubject)
                    .addComponent(lbCondition))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnUpdate.setText("Modificar");

        btnDelete.setText("Bajas");

        btnInsert.setText("Altas");

        btnExit.setText("Salir");

        btnSelect.setText("Select");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnInsert))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnSelect))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbSearchColumn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Titulo", "Autor", "Editorial", "Asignatura", "Estado" }));

        btnSearch.setText("Buscar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbSearchColumn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSearchColumn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable booksTable;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbSearchColumn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAuthor;
    private javax.swing.JLabel lbCode;
    private javax.swing.JLabel lbCondition;
    private javax.swing.JLabel lbEditorial;
    private javax.swing.JLabel lbSubject;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField textAuthor;
    private javax.swing.JTextField textCode;
    private javax.swing.JTextField textCondition;
    private javax.swing.JTextField textEditorial;
    private javax.swing.JTextField textSearch;
    private javax.swing.JTextField textSubject;
    private javax.swing.JTextField textTitle;
    // End of variables declaration//GEN-END:variables
}
