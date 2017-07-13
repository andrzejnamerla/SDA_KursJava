package ProgObiektowe.distanceFromOrigin;

/**
 * Created by RENT on 2017-07-13.
 */

public class Point {

    public double x;

    public double y;

    public Point(){}

    public double distance(){
        double distFromOrigin = Math.sqrt(x*x+y*y);
        return distFromOrigin;
    }
}
