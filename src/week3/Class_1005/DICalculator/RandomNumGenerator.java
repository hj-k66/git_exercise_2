package week3.Class_1005.DICalculator;


public class RandomNumGenerator implements NumberGenerator {
    //랜덤으로 숫자 생성

    @Override
    public int generate(int num) {
        return (int)(Math.random()*num);
    }
}
