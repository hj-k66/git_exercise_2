package week3.Class_1005.collection;

public class Student {
    private int classNo;
    private String name;
    private String gitRepositoryAddress;

    public Student(int classNo, String name, String gitRepositoryAddress) {
        this.classNo = classNo;
        this.name = name;
        this.gitRepositoryAddress = gitRepositoryAddress;
    }
    public String toString(){
        return this.classNo  + ", " + this.name + ", " + this.gitRepositoryAddress;
    }
}
