package week3.Class_1006.collection;

public class RandomAlphabetGenerator implements Generator<Character> {

    @Override
    public Character generate() {
        int r = (int)(Math.random()*26+65);
        return (char)r;
    }
}
