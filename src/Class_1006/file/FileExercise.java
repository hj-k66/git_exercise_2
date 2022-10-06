package Class_1006.file;

import java.io.File;

public class FileExercise {
    public static void main(String[] args) {
        //현재 디렉토리 파일 목록 출력
        File dir = new File("./");
        File files[] = dir.listFiles();
        for(File file : files){
            System.out.println(file);
        }
    }
}
