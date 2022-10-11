package week3.Class_1006.file;

import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MyFileReader {


    private String filename;

    public MyFileReader(String filename) {
        this.filename = filename;
    }

    char readOneByte() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(this.filename));
        return (char) br.read();
    }

    String readTwoByte() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(this.filename));
        String s = "";
        for(int i = 0; i<2;i++){
            s += (char)br.read();
        }
        return s;
    }
    String readNByte(int n) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(this.filename));
        String s = "";
        for(int i = 0; i < n; i++){
            s += (char)br.read();
        }
        return s;
    }

    boolean FilesExists() {
        return Files.exists(Paths.get(this.filename));
    }

    public static void main(String[] args) throws IOException {
        MyFileReader myFileReader = new MyFileReader("./hello.txt");
        if (myFileReader.FilesExists()) {
            char ch = myFileReader.readOneByte();
            System.out.println(ch);
            String s2 = myFileReader.readTwoByte();
            System.out.println(s2);
            String s3 = myFileReader.readNByte(5);
            System.out.println(s3);
        }
    }

}


