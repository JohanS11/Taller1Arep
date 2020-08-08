package edu.escuelaing.arep.calculator.app;


public class Calculator {

    public Double calcMean(LinkedList<Double> list){
        double suma = 0;
        for (double element : list){
            suma += element;
        }
        return suma/list.getSize();

    }
    public double calcStandardDeviation(LinkedList<Double> list){
        double average = calcMean(list);
        double numerador = 0;
        for (double i : list){
            numerador += Math.pow(i-average,2);
        }
        return Math.sqrt(numerador / (list.getSize()-1));
    }
}
