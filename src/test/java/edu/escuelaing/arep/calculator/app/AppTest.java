package edu.escuelaing.arep.calculator.app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Test class to verify that our LinkedList and our Calculator works :)
 * @author Johan Sebastián Arias
 */
public class AppTest {
    Calculator calculator;

    private final double[] dataSetProxy = {160, 591, 114, 229, 230, 270, 128, 1657, 624, 1503};
    private final double[] dataSetDevelopment = {15.0, 69.9, 6.5, 22.4, 28.4, 65.9, 19.4, 198.7, 38.8, 138.2};
    private final double[] dataSet1 = {16.0, 32.9, 6.5, 23.4, 28.4, 65.9, 1.4, 198.6, 36.8, 22.2};
    private final double[] dataSet2 = {17.0, 45.9, 2.5, 25.3, 28.5, 66.9, 10.4, 192.1, 24.8, 12.2};
    private final double[] dataSet3 = {12.0, 12.9, 11.5, 21.4, 28.4, 7.9, 12.4, 10.3, 13.8, 11.2};
    private final double[] dataSet4 = {10.0, 15.9, 30.5, 41.4, 68.4, 17.9, 78.4, 111.3, 24.8, 1422.2};
    private final double[] dataSet5 = {100.0, 11.9, 31.5, 51.4, 18.4, 27.9, 11.45, 112.3, 145.8, 1424.2};


    private final LinkedList<Double> linkedListProxy = new LinkedList<Double>();
    private final LinkedList<Double> linkedListDevelopment = new LinkedList<Double>();
    private final LinkedList<Double> linkedList1 = new LinkedList<Double>();
    private final LinkedList<Double> linkedList2 = new LinkedList<Double>();
    private final LinkedList<Double> linkedList3 = new LinkedList<Double>();
    private final LinkedList<Double> linkedList4 = new LinkedList<Double>();
    private final LinkedList<Double> linkedList5 = new LinkedList<Double>();

    @Before
    public void setup() {
        calculator = new Calculator();
        for (Double i : dataSetProxy) {
            linkedListProxy.addNodeRight(i);
        }
        for (Double i : dataSetDevelopment) {
            linkedListDevelopment.addNodeRight(i);
        }
        for (int i = 0; i < dataSet1.length; i++) {
            linkedList1.addNodeRight(dataSet1[i]);
            linkedList2.addNodeRight(dataSet2[i]);
            linkedList3.addNodeRight(dataSet3[i]);
            linkedList4.addNodeRight(dataSet4[i]);
            linkedList5.addNodeRight(dataSet5[i]);
        }
    }

    @Test
    public void shouldCalculateMean() {

        assertEquals(550.6, calculator.calcMean(linkedListProxy), 0.0);
        assertEquals(60.32, calculator.calcMean(linkedListDevelopment), 0.0);
    }

    @Test
    public void shouldCalculateMeanSets(){
        assertEquals(43.21, calculator.calcMean(linkedList1), 0.0);
        assertEquals(42.56, calculator.calcMean(linkedList2), 0.0);
        assertEquals(14.18, calculator.calcMean(linkedList3), 0.0);
        assertEquals(182.08, calculator.calcMean(linkedList4), 0.0);
        assertEquals(193.49, calculator.calcMean(linkedList5), 0.0);
    }

    @Test
    public void shouldCalculateStandarD() {
        assertEquals(572.03, calculator.calcStandardDeviation(linkedListProxy), 0.05);
        assertEquals(62.26, calculator.calcStandardDeviation(linkedListDevelopment), 0.05);
    }

    @Test
    public void shouldCalculateSdSets(){
        assertEquals(57.44, calculator.calcStandardDeviation(linkedList1), 0.05);
        assertEquals(55.77, calculator.calcStandardDeviation(linkedList2), 0.05);
        assertEquals(6.1, calculator.calcStandardDeviation(linkedList3), 0.05);
        assertEquals(436.94, calculator.calcStandardDeviation(linkedList4), 0.05);
        assertEquals(434.98, calculator.calcStandardDeviation(linkedList5), 0.05);
    }

}

