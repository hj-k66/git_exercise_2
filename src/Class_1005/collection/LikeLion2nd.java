package Class_1005.collection;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2nd {
    private List<String> students = new ArrayList<>();

    public LikeLion2nd() {
        Names names = new Names();
        this.students = names.names();
    }

    //멋사 2기 학생의 이름이 들어있는 list 리턴하는 메소드
    public List<String> getStudentList(){
        return this.students;
    }
}
