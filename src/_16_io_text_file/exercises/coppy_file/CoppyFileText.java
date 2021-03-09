package _16_io_text_file.exercises.coppy_file;

import java.io.*;

public class CoppyFileText {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src\\_16_io_text_file\\exercises\\text1.txt"));
            writer.write("Huy\n");
            writer.write("Cong\n");
            writer.write("Tai\n");
            writer.write("Kien\n");
            writer.close();
            BufferedWriter writer2= new BufferedWriter(new FileWriter("src\\_16_io_text_file\\exercises\\textnew.txt"));
            BufferedReader reader=new BufferedReader(new FileReader("src\\_16_io_text_file\\exercises\\text1.txt"));
            String string= "";
            int count = 0;
            while ((string= reader.readLine()) !=null ) {
                System.out.println(string);
                count+=string.length();
                writer2.write(string +"\n");

            }
            System.out.println("Số ký tự trong file "+ count);
            writer2.close();
            reader.close();
            File file=new File("C:\\Users\\Administrator\\Desktop\\abc.txt");
            System.out.println(file.length());
            File file1=new File(String.valueOf(reader));
            System.out.println(file1.length());
        }catch (Exception e){

        }
    }
}
