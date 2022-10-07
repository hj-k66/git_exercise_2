package Class_1007;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PopulationStatistic {
    public void readByChar(String filename)throws  IOException{
        FileReader fileReader = new FileReader(filename);
        //파일을 읽지 않음

        String fileContents ="";
        while(fileContents.length()<1_000_000){
            char c = (char)fileReader.read();
            fileContents += c;
            System.out.println(fileContents);
        }
        System.out.println(fileContents);

    }

    public void readByLine(String filename) throws  IOException{
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String str;
        while((str= reader.readLine())!=null){
            System.out.println(str);
        }
        reader.close();

    }

    public void readByLine2(String filename) {
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8)){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public PopulationMove parse(String data){
        //전입 : to, 전출: from
        String[] splitData = data.split(",");
        int toSido = Integer.valueOf(splitData[0]);
        int fromSido = Integer.valueOf(splitData[6]);
        return new PopulationMove(fromSido, toSido);
    }

    public String readOneLine(String filename) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        return reader.readLine();
    }

    public static void main(String[] args) throws IOException {
        String address = "C:\\2021_인구관련연간자료_20221007_07638.csv";
        PopulationStatistic populationStatistic = new PopulationStatistic();

        String data = populationStatistic.readOneLine(address);
        PopulationMove populationMove = populationStatistic.parse(data);
        System.out.println("ToSido = " + populationMove.getToSido());
        System.out.println("FromSido = " + populationMove.getFromSido());

    }
}
