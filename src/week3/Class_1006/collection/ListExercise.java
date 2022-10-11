package week3.Class_1006.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    private List<String> students;

    public ListExercise(){
        this.students = new ArrayList<>();
        this.students.add("김희정");
        this.students.add("김가가");
        this.students.add("이나나");
        this.students.add("박다다");
    }

    public List<String> getStudents(){
        return this.students;
    }

}
