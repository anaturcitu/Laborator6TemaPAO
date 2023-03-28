package model;

import java.util.Date;

public class Student {

    private String name;
    private String cnp;
    private Date birthDate;

    public Student(String name, String cnp, Date birthDate) {
        this.name = name;
        this.cnp = cnp;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cnp='" + cnp + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
