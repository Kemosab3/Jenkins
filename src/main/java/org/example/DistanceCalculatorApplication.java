package org.example;

public class DistanceCalculatorApplication {
    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);

        System.out.println("Distance between the two points: " + point1.distanceTo(point2));
    }
}
