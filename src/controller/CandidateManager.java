package controller;

import java.util.ArrayList;
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
    
    }

