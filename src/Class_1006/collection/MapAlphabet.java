package Class_1006.collection;

import Class_1005.DICalculator.Calculator;

import java.util.HashMap;

//주어진 문자열의 알파벳 갯수 세서 map에 넣기
//대소문자 구별 x
public class MapAlphabet {
    public static void main(String[] args) {
        String addr = "https://github.com/hj-k66/git_exercise_2.git";
        HashMap<Character, Integer> alphabetCnt = new HashMap<>();

        //map 초기화 : key에 알파벳 셋팅
        for(int i = 0; i < 26; i++){
            alphabetCnt.put((char)('A'+ i), 0);
        }

        //주어진 문자열 알파벳 갯수 세서 map에 넣기
        for(int j = 0; j < addr.length(); j++) {
            char currChar = addr.charAt(j);
            //알파벳인지 판단
            if((currChar >=65 && currChar <=90) || (currChar>=97 && currChar<=122)){
                char currUpper = Character.toUpperCase(currChar);
                int currcnt = alphabetCnt.get(currUpper);
                alphabetCnt.put(currUpper,++currcnt);
            }
        }

        //알파벳별 개수 출력
        System.out.println(alphabetCnt);


    }
}
