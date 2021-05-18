/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Velux
 */
public class Fitbyte {

    private int age;
    private int heartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.heartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        double result = 0;
        double maxHeartRate = 0;
        maxHeartRate = 206.3 - (0.711 * age);

        /* The Karvonen method allows you to calculate your target heart rate for physical exercise. The target heart rate is calculated with the formula (maximum heart rate - resting heart rate) * (target heart rate percentage) + resting heart rate, where the target heart rate is given as a percentage of the maximum heart rate. */
        result = (maxHeartRate - heartRate) * (percentageOfMaximum) + heartRate;
        return result;
    }
}
