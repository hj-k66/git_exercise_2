package week3.Class_1005.collection;

import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        LikeLion2nd likeLion2nd = new LikeLion2nd();
        List<String> students = likeLion2nd.getStudentList();
        List<Student> studentobjs = likeLion2nd.getStudentobj();
        for (String student: students) {
            System.out.println(student);
        }

        for (Student studentobj : studentobjs) {
            System.out.println(studentobj);
        }
    }
}
