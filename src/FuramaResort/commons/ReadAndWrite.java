package FuramaResort.commons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public interface ReadAndWrite<T> {
    public static final String PATH = "C:\\Users\\Administrator\\Desktop\\Module 1\\C1220G1_Nguyen_Huy\\module_2\\C1220G2_NguyenHuy_Module2\\src\\FuramaResort\\data\\";
    public static  <T> void writeFile(String fileName, List<T> list, boolean writeMode) {
        File file = new File(PATH + fileName);
        BufferedWriter bufferedWriter = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedWriter = new BufferedWriter(new FileWriter(file, writeMode));
            for (T t : list) {
                bufferedWriter.write(t.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error in writing.");
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static  List<String[]> readFile(String fileName) {
        List<String[]> list = new ArrayList<>();
        File file = new File(PATH + fileName);
        BufferedReader bufferedReader = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");


                list.add(temp);
            }
        } catch (IOException e) {
            System.out.println("Error in reading.");
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }




}
