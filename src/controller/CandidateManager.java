package controller;

import java.util.ArrayList;
import java.util.function.Predicate;
import model.Candidate;
import model.Experience;
import model.Fresher;
import model.Intern;

public class CandidateManager {
    ArrayList<Candidate> list = new ArrayList<>();

    public CandidateManager() {
    }
    
    public void addCandidate(Candidate cd){
        list.add(cd);
    }
    
    public void display(ArrayList<Candidate> rs) {
        for (Candidate candidate : rs) {
            System.out.println(candidate);
        }
    }
    public ArrayList<Candidate> search(Predicate<Candidate> c) {
        ArrayList<Candidate> rs = new ArrayList<Candidate>();
        for (Candidate customer : list) {
            if (c.test(customer)) {
                rs.add(customer);
            }
        }
        return rs;
    }
   public void listing(){
        System.out.println("===========EXPERIENCE CANDIDATE============");
        for (Candidate cd : list) {
            if (cd instanceof Experience) System.out.println(cd.getFirstName() +" " + cd.getLastName());
        }
        System.out.println("==========FRESHER CANDIDATE==============");
        for (Candidate cd : list) {
            if (cd instanceof Fresher) System.out.println(cd.getFirstName() +" " + cd.getLastName());
        }
        System.out.println("===========INTERN CANDIDATE==============");
        for (Candidate cd : list) {
            if (cd instanceof Intern) System.out.println(cd.getFirstName() +" " + cd.getLastName());
        }
    }
    
    }

