package ProgObiektowe.distanceFromOrigin;

import java.util.Random;

/**
 * Created by RENT on 2017-07-13.
 */
public class PointMain {
    public static void main(String[] args) {
        Random random = new Random();

        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();

        p1.x = random.nextDouble()*100;
        p1.y = random.nextDouble()*50;

        p2.x = random.nextDouble()*20;
        p2.y = random.nextDouble()*40;

        p3.x = random.nextDouble()*50;
        p3.y = random.nextDouble()*200;

        System.out.println(p1.distance());
        System.out.println(p2.distance());
        System.out.println(p3.distance());
    }
}
