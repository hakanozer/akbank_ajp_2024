package com.works.days4.useFile;

import java.util.List;

public class MainFile {
    public static void main(String[] args) {

        Manager manager = new Manager();
        //manager.createFile();
        //manager.writeData("5- New Data");

        List<String> ls = manager.readData();
        for(String item : ls) {
            System.out.println(item);
        }

    }
}
