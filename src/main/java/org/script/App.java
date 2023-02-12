package org.script;

import org.script.model.InputData;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "\\Desktop";
        String outputFileName = "songs-dml-script.sql";
        Scanner scanner = new Scanner(System.in);
        InputData inputData = new InputData();

        inputData.setSqlOutputFileLocation(outputFileName);
        System.out.println("Enter the location of songs-master-sheet.xlsx: ");
        inputData.setMasterInputSheetLocation(scanner.next());
        System.out.println("Output file will be generated in " + desktopPath);
        System.out.println("Output file name will be: " + outputFileName);

        //todo - read data from excel sheet using apache poi
        //todo - pass data to selenium object
        //todo - open html file using selenium
        //todo - transliterate the input text to english using html file and selenium
        //todo - get the transliterated text using selenium and pass to output data object
        //todo - open the master-sheet and update the column value
        //todo - generate the dml insert scripts
        //todo - put the generated insert scripts in file

        try (FileWriter fileWriter = new FileWriter(desktopPath + "\\" + outputFileName)) {
            fileWriter.write("INSERT INTO SAMPLE_TABLE VALUES (1,2,3,4,5);");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
