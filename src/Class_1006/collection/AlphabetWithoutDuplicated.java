package Class_1006.collection;

import Class_1005.DICalculator.RandomNumGenerator;

import java.util.HashSet;
import java.util.Set;
//알파벳 A ~ Z 까지 랜덤한 알파벳을 50개 생성하고 중복제거
public class AlphabetWithoutDuplicated {
    public static void main(String[] args) {
        RandomAlphabetGenerator randomAlphabetGenerator = new RandomAlphabetGenerator();
        Set<Character> randomSet = new HashSet<>();
        for(int i = 0; i < 50; i++){
            Character s = randomAlphabetGenerator.generate();
            System.out.println("s = " + s);
            randomSet.add(s);
        }
        System.out.println(randomSet);
    }
}
