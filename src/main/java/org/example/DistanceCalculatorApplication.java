package org.example;

public class DistanceCalculatorApplication {

    // This is the main entry point when running the application from the command line
    public static void main(String[] args) {
        new DistanceCalculatorApplication().run();
    }

    // run method to encapsulate the logic
    public void run() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);

        System.out.println("Distance between the two points: " + point1.distanceTo(point2));
    }
}
