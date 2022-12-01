package testing;
import java.io.*;
import java.util.Scanner;
import java.util.*;  

public class FileReaderDemo {
    public String path;
    Scanner scanner;
    List<String[]> list = new ArrayList<String[]>();

    public FileReaderDemo(String path) {
        this.path = path;
        try {
            scanner = new Scanner(new File(path));
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine().split(","));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String[] getData(int index) {
        return list.get(index);
    }
}

