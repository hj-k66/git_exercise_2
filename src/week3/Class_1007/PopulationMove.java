package week3.Class_1007;

public class PopulationMove {
    private int fromSido;
    private int toSido;

    //constructor 추가, fromSido, toSido를 받아서 멤버변수에 넣는 기능
    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido; //전출
        this.toSido = toSido;     //전입


    }

    //getter추가
    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }


}
