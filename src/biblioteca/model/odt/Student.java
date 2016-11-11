package biblioteca.model.odt;

public class Student {

    private String dni;
    private String name;
    private String subname1;
    private String subname2;
    private String register;

    public Student() {
        register = null;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubname1() {
        return subname1;
    }

    public void setSubname1(String subname1) {
        this.subname1 = subname1;
    }

    public String getSubname2() {
        return subname2;
    }

    public void setSubname2(String subname2) {
        this.subname2 = subname2;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

}
