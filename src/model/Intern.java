package model;

import java.util.Date;

public class Intern extends Candidate {
    private String majors; 
    private String semeter; 
    private String nameUni;

    public Intern(String majors, String semeter, String nameUni, String candidateId, String firstName, String lastName, Date birthDate, String address, String phone, String email, String candidateType) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.majors = majors;
        this.semeter = semeter;
        this.nameUni = nameUni;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemeter() {
        return semeter;
    }

    public void setSemeter(String semeter) {
        this.semeter = semeter;
    }

    public String getNameUni() {
        return nameUni;
    }

    public void setNameUni(String nameUni) {
        this.nameUni = nameUni;
    }

  
 
}
