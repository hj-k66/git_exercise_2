package week3.Class_1006.collection;


import week3.Class_1005.DICalculator.RandomNumGenerator;

import java.util.HashSet;
import java.util.Set;

public class RndNumberWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumGenerator randomNumGenerator = new RandomNumGenerator();
        Set<Integer> randomSet = new HashSet<>();
        for(int i = 0; i < 50; i++){
            int r = randomNumGenerator.generate(10);
            System.out.println("r = " + r);
            randomSet.add(r);
        }
        System.out.println(randomSet);
    }
}
