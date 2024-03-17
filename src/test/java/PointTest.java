package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PointTest {
    @Test
    public void testDistance() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);
        assertEquals(5.0, point1.distanceTo(point2), 0.001);
    }
}
