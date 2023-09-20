package bai_tap_hoc_lai.ss14_sort.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    // doc file
    public static List<String> readFile(String path) {
        List<String> strings = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                strings.add(str);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return strings;
    }

    // ghi file
    public static void writeFile(String path, List<String> strings) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (String str : strings) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
