package _16_io_test_file._1practice.find_max_value;

import java.util.*;
import java.io.*;


public class ReadAndWriteFile {
   public List<Integer> readFile(String path){
       List<Integer> number = new ArrayList<>();

       try {
           File file = new File(path);
           if(!file.exists()){
               throw new FileNotFoundException();
           }
           BufferedReader br = new BufferedReader(new FileReader(file));

           String line ="";
           while ((line = br.readLine()) !=null){
               number.add(Integer.parseInt(line));
           }
           br.close();

       }catch (Exception e){
           System.out.println("");
       }
       return number;
   }

   public void writeFile(String path, int max){
       try {
            FileWriter file = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(file);
            bw.write("Gia trị max là:" + max);
            bw.close();

       }catch (Exception e){
        e.printStackTrace();
       }
   }
}
