package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here

        File file = new File("book.txt");
        Scanner scanner = new Scanner(file);

        int words = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            words += line.split("").length;
        }
        System.out.println("The file Contain " + words + " Words");
    }
}
