package bai_tap_hoc_lai.ss17_binary_file.utils;

import bai_tap_hoc_lai.ss17_binary_file.model.Spending;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static void writeFile(String path, List<Spending> spendings) {
        try (FileOutputStream fos = new FileOutputStream(path);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (Spending spending :spendings ) {
                oos.writeObject(spending);
            }
            oos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static List<Spending> readFile(String path) {
        List<Spending> spendings = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(path);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (fis.available() > 0) {
                Spending spending = (Spending) ois.readObject();
                spendings.add(spending);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return spendings;
    }
}
