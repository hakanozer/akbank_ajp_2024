package com.works.days4.useFile;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {

    private File file = new File("sample.txt");

    public void createFile() {
        try {
            file.createNewFile();
        }catch (Exception ex) {
            System.err.println("createFile error: " + ex);
        }
    }

    public void writeData(String line) {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.append(line);
            fileWriter.append(System.lineSeparator());
            fileWriter.close();
        }catch (Exception ex) {
            System.err.println("writeData error: " + ex);
        }
    }

    public List<String> readData() {
        List<String> ls = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()) {
                String line = scanner.nextLine();
                ls.add(line);
            }
            scanner.close();
        }catch (Exception ex) {
            System.err.println("readData error:" + ex);
        }
        return ls;
    }

}
