package _16_io_text_file.exercises.read_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("src\\_16_io_text_file\\exercises\\read_file\\danhSach.csv"));
            String string = "";

            List<String[]> arrayList = new ArrayList();
            String[] temp;
            while ((string = reader.readLine()) != null) {
                temp = string.split(",");
                arrayList.add(temp);
            }
//    Xóa phần tử trong danh sách dựa theo thành phần
//            Iterator<String[]> iterator = arrayList.iterator();
//            while (iterator.hasNext()) {
//                String[] str = iterator.next();
//                if (str[5].equals("\"China\"")) {
//                   iterator.remove();
//                }
//            }
//            for(int i=0;i<arrayList.size();i++){
//                if(arrayList.get(i)[5].equals("\"Japan\"")) {
//                    arrayList.remove(i);
//                }
//            }


            for (String[] strings : arrayList) {
                System.out.println(Arrays.toString(strings));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


}
