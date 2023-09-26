package bai_tap_hoc_lai.ss16_io_text_file.ultis;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    // doc file
    public static List<String> readFile(String path){
        BufferedReader bufferedReader = null;
        List<String> strings = new ArrayList<>();
        try {
            new BufferedReader(new FileReader(path));
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                strings.add(str);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return strings;
    }

    // ghi file
    public static void writeFile(String path, List<String> strings){
        BufferedWriter bufferedWriter = null;
        try {
            new BufferedWriter(new FileWriter(path));
            for (String str : strings) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
