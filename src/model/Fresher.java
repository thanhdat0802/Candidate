package model;

import java.util.Date;

public class Fresher extends Candidate {
    private Date graduationDate;
    private String rank; 
    private String education;

    public Fresher(Date graduationDate, String rank, String education, String candidateId, String firstName, String lastName, Date birthDate, String address, String phone, String email, String candidateType) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, "Fresher");
        this.graduationDate = graduationDate;
        this.rank = rank;
        this.education = education;
    }

    public Date getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

 
}
