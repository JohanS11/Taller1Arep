package edu.escuelaing.arep.calculator.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class CalculatorApp
{
    public static  void main(String[] args )
    {
        LinkedList<Double> linkedList = new LinkedList<Double>();

        try {
            File myFile = new File("filename.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
            }
            myReader.close();

        } catch (FileNotFoundException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
