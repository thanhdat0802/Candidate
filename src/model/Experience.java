package model;

import java.util.Date;

public class Experience extends Candidate {
    private int expInYear;
    private String proSkill;

    public Experience(int expInYear, String proSkill, String candidateId, String firstName, String lastName, Date birthDate, String address, String phone, String email, String candidateType) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, "Experiece");
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
    
}
