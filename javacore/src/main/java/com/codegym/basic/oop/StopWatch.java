package com.codegym.basic.oop;

import com.codegym.basic.arrayandmethod.ArrayAndMethod;

public class StopWatch {
    private long startTime;
    private long stopTime;

    public StopWatch(long startTime, long stopTime) {
        this.startTime = startTime;
        this.stopTime = stopTime;
    }
    public StopWatch() {
//        this.startTime = System.currentTimeMillis();
    }
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    public void stop() {
        this.stopTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return this.stopTime - this.startTime;
    }


    public void setStopTime(long stopTime) {
        this.stopTime = stopTime;
    }

    public long getStopTime() {
        return stopTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void runStopWatch() {
        this.start();
        // Gia su chay het 10p
        int arr[] = ArrayAndMethod.inputArrayRandom();
        ArrayAndMethod.sortArray(arr);

        this.stop();
        System.out.printf("Sap xep lai mang mat %d giay", this.getElapsedTime());

    }
}
