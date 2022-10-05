package Class_1005.DICalculator;

public class ByPassNumGenerator implements NumberGenerator{
    //generate한 숫자를 그대로 넘김
    @Override
    public int generate(int num) {
        return num;
    }
}
