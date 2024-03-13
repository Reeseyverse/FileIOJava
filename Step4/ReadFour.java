package Step4;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour {

    /**
     * Yes, you can look at the other
     * examples in this lab to build your solution here.
     */
    public static void main(String[] args) {
        try {

            File startingPath = new File(System.getProperty("user.dir"));
            Scanner fileIn = new Scanner(new File(startingPath, "/Step4/input.txt"));


            int counter = 1;
            int sum = 0;
            while (fileIn.hasNext()) {
                String lineIn = fileIn.nextLine();
                sum = sum + Integer.parseInt(lineIn);
                File newFile = new File("/Users/jorrisezeckel/Desktop/Projects/FileIOJava/Step4/output.txt" + counter + ".txt");
                PrintWriter lastFile = new PrintWriter(newFile);
                lastFile.println("Running total = " + sum);
                counter++;
                lastFile.close();
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}