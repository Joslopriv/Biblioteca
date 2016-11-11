package biblioteca.controller.dialogController;

import biblioteca.model.odt.Student;
import biblioteca.view.dialog.StudentDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JTable;

public class StudentDialogController extends MouseAdapter implements ActionListener {

    private StudentDialog studentDialog;

    public StudentDialogController(StudentDialog studentDialog) {
        this.studentDialog = studentDialog;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String onButton = e.getActionCommand();
        Student student = createStudent();
        if (onButton.equalsIgnoreCase("buscar")) {
            String column = (String) studentDialog.getCbSearchColumn().getSelectedItem();
            String value = studentDialog.getTextSearch().getText();
            studentDialog.updateTableForColumnValue(column, value);
        }  else {
            if (onButton.equalsIgnoreCase("modificar")) {
                studentDialog.getStudentSql().update(student);
            }
            if (onButton.equalsIgnoreCase("bajas")) {
                studentDialog.getStudentSql().delete(student);
            }
            if (onButton.equalsIgnoreCase("altas")) {
                studentDialog.getStudentSql().insert(student);
            }
            studentDialog.updateTableAllStudents();
        }
        if (onButton.equalsIgnoreCase("select")) {
            System.out.print("caca");
            studentDialog.dispose();
        }
        if (onButton.equalsIgnoreCase("salir")) {
            studentDialog.dispose();
        }
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        JTable studentsTable = studentDialog.getStudentsTable();
        int rowSelect = studentsTable.getSelectedRow();

        String register = String.valueOf(studentsTable.getValueAt(rowSelect, 0));
        String dni = String.valueOf(studentsTable.getValueAt(rowSelect, 1));
        String name = String.valueOf(studentsTable.getValueAt(rowSelect, 2));
        String subname1 = String.valueOf(studentsTable.getValueAt(rowSelect, 3));
        String subname2 = String.valueOf(studentsTable.getValueAt(rowSelect, 4));

        studentDialog.getTextRegister().setText(register);
        studentDialog.getTextDni().setText(dni);
        studentDialog.getTextName().setText(name);
        studentDialog.getTextSubname1().setText(subname1);
        studentDialog.getTextSubname2().setText(subname2);
    }

    private Student createStudent() {
        Student student = new Student();

        String register = studentDialog.getTextRegister().getText();
        String dni = studentDialog.getTextDni().getText();
        String name = studentDialog.getTextName().getText();
        String subname1 = studentDialog.getTextSubname1().getText();
        String subname2 = studentDialog.getTextSubname2().getText();

        student.setRegister(register);
        student.setDni(dni);
        student.setName(name);
        student.setSubname1(subname1);
        student.setSubname2(subname2);

        return student;
    }

}
