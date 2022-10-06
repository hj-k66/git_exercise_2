package Class_1006.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {

    private String filename;

    public FileReader(String filename){
        this.filename = filename;
    }
    char readOneByte() throws IOException {
        BufferedReader br = new BufferedReader(new java.io.FileReader(this.filename));
        return (char)br.read();
    }

    boolean FilesExists() {
        return Files.exists(Paths.get(this.filename));
    }

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("./hello.txt");
        if(fileReader.FilesExists()){
            char ch = fileReader.readOneByte();
            System.out.println(ch);
        }
    }

}
