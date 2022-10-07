package Class_1007;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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


    //파일의 모든 라인을 읽어 파싱
    //파싱한 결과 list로 return
    public List<PopulationMove> readByLine(String filename) throws  IOException{
        List<PopulationMove> pmlist = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String str;
        while((str= reader.readLine())!=null){
//            System.out.println(str);
            PopulationMove populationMove = parse(str);
            pmlist.add(populationMove);
        }
        reader.close();
        return pmlist;
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


    //parsing 로직 변경 (targer file 변경 : from_to.txt)
    public PopulationMove parse(String data){
        //전입 : to, 전출: from
        String[] splitData = data.split(",");
        int toSido = Integer.valueOf(splitData[0]);
        int fromSido = Integer.valueOf(splitData[1]);
        return new PopulationMove(fromSido, toSido);
    }

    public String readOneLine(String filename) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        return reader.readLine();
    }

    public void createAFile(String filename){
        File file = new File(filename);
        try{
            file.createNewFile();
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    public void write(List<String> strs, String filename){
        File file = new File(filename);
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for(String str:strs){
                bufferedWriter.write(str);
            }
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public String fromToString(PopulationMove populationMove){
        return populationMove.getFromSido() + "," + populationMove.getToSido()+"\n";
    }
    public static void main(String[] args) throws IOException {
        String address = "C:\\2021_인구관련연간자료_20221007_07638.csv";
        PopulationStatistic populationStatistic = new PopulationStatistic();
        List<PopulationMove> pml = populationStatistic.readByLine(address);

        for (PopulationMove pm: pml){
            System.out.printf("전입:%s, 전출:%s\n", pm.getToSido(), pm.getFromSido());
        }


    }
}
