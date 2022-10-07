package Class_1007;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

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

    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml){
        Map<String, Integer> movecntMap = new HashMap<>();
        for(PopulationMove pm : pml){
            String key = pm.getFromSido() + "," + pm.getToSido();
            if(movecntMap.get(key) ==null){
                movecntMap.put(key,1);
            }
            movecntMap.put(key, movecntMap.get(key)+1);
        }
        return movecntMap;
    }

    //시도코드를 heatmap index로 맵핑
    //key : 시도코드, value : index
    public Map<String,String> getHeatmapIdx(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        Map<String,String> map = new HashMap<>();
        String str;
        while((str= reader.readLine())!=null){
            String[] line = str.split(",");
            map.put(line[1],line[0]);
        }
        return map;
    }

    public static void main(String[] args) throws IOException {
        String address = "./from_to.txt";
        PopulationStatistic populationStatistic = new PopulationStatistic();
        List<PopulationMove> pml = populationStatistic.readByLine(address);

        Map<String, Integer> moveCntMap = populationStatistic.getMoveCntMap(pml);
        Map<String, String> heatmapIdxmap = populationStatistic.getHeatmapIdx("./sidocode.txt");

        String targetFile = "./for_heatmap.txt";
        populationStatistic.createAFile(targetFile);
        List<String> cntResult = new ArrayList<>();

        //전입-전출 count한 결과를 heatmap 형식으로 mapping하여 파일로 저장
        for(String key :moveCntMap.keySet()){
            String[] fromto = key.split(",");
            //heatmap 형식 : [전입시도 idx, 전출시도 idx, count]로 매핑해서 저장
            String s = String.format("[%s, %s, %d]\n", heatmapIdxmap.get(fromto[0]),heatmapIdxmap.get(fromto[1]), moveCntMap.get(key));
            cntResult.add(s);
        }
        populationStatistic.write(cntResult, targetFile);
    }
}
