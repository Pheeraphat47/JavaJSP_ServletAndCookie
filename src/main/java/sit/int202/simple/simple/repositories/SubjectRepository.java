package sit.int202.simple.simple.repositories;

import sit.int202.simple.simple.entities.Subject;

import java.util.*;

public class SubjectRepository {
    private static List<Subject> subjects;
    public List<Subject> findAll() {
        return subjects;
    }
    public SubjectRepository() {
        initialize();
    }
    private void initialize() {
        subjects = new ArrayList<>(20);


        subjects.add(new Subject("INT 100", "IT Fundamentals", 3));
        subjects.add(new Subject("INT 103", "Advance Programming", 3));
        subjects.add(new Subject("INT 104", "Basic SQL", 1));
        subjects.add(new Subject("INT 107", "Computing Platform Technology", 3));
        subjects.add(new Subject("INT 207","Network 1" , 3));

    }
}


