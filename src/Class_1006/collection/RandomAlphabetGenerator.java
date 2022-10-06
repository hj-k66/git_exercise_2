package Class_1006.collection;

import Class_1005.DICalculator.NumberGenerator;

public class RandomAlphabetGenerator implements Generator<Character> {

    @Override
    public Character generate() {
        int r = (int)(Math.random()*26+65);
        return (char)r;
    }
}
