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
    
    public void display() {
        for (Candidate candidate : list) {
            System.out.println(candidate);
        }
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

    }

