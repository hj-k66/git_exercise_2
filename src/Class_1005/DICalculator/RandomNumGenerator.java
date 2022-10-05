package Class_1005.DICalculator;


public class RandomNumGenerator implements NumberGenerator {

    @Override
    public int generate(int num) {
        return (int)(Math.random()*num);
    }
}
