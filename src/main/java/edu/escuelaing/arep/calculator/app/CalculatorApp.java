package edu.escuelaing.arep.calculator.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Main class that reads a text file and joins the classes with its functionalities.
 * @author Johan Sebastián Arias
 */
public class CalculatorApp
{
    private static final Calculator calculator = new Calculator();
    public static  void main(String[] args ) throws ListException {

        try {
            File myFile = new File(args[0]);
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                calculate(readContent(data));
            }
            myReader.close();

        } catch (FileNotFoundException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

    private static LinkedList<Double> readContent(String data){
        LinkedList<Double> linkedList = new LinkedList<Double>();
        String[] dataArray = data.split(",");
        for (String i : dataArray){
            double value = Double.parseDouble(i);
            linkedList.addNodeRight(value);
        }
        return linkedList;
    }

    private static void calculate(LinkedList<Double> linkedList) {
        System.out.println("[+] Mean: " + calculator.calcMean(linkedList));
        System.out.println("[+] Standard Deviation: " + calculator.calcStandardDeviation(linkedList));

    }


}
