package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import controller.CandidateManager;
import model.Candidate;
import model.Experience;
import view.Menu;
import view.Validation;

public class CompanyManager extends Menu<String> {

    static String[] menu = {"Experience", "Exit"};
    private CandidateManager list = new CandidateManager();
    Validation val = new Validation();

    public CompanyManager() {
        super("Candidate Management System", menu);
    }
//--------------------------------------------------

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:

            case 2:
                System.exit(0);
        }
    }
//--------------------------------------------------

    private String getValue(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        return sc.nextLine();
    }
//--------------------------------------------------

    private Candidate inputCandidate(int a) {
        String candidateId = getValue("Input ID: ");
        String firstName = getValue("Input first name: ");
        String lastName = getValue("Input last name: ");
        Date birDate = null;
                try {
                    while (birDate == null) {
                        birDate = val.checkValidDate(getValue("Input birthdate: "));
                        if (birDate == null) {
                            System.out.println("Please input again in the appropriate format (xx/yy/zzzz): ");
                        }
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
        String address = getValue("Input address: ");
        String phone = null;
                try {
                    while (phone == null) {
                        phone = val.checkPhone(getValue("Input phone number:  "));
                        if (phone == null) {
                            System.out.println("Please input again in the appropriate format: ");
                        }
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
        String email = getValue("Input email: ");
        String candidateType;
        switch (a) {
            case 1:
                candidateType = "Experience";
                int year = -1;
                try {
                    while (year == -1) {
                        year = val.checkInt(getValue("Input year experienced: "));
                        if (year == -1) {
                            System.out.println("Please input again in the appropriate format (0-100): ");
                        }
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                String proSkill = getValue("Input professional skill: ");
                return new Experience(year, proSkill, candidateId, firstName, lastName, birDate, address, phone, email, candidateType);
            case 2:
                candidateType = "Fresher";
                String graYear = getValue("Input year graduated: ");
                String rank = getValue("Input rank: ");
                String education = getValue("Input university: ");
                break;
            case 3:
                candidateType = "Experience";
                String major = getValue("Input major: ");
                String semester = getValue("Input semester: ");
                String university = getValue("Input university: ");
                break;
        }
    }

}
