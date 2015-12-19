package Geometry2D;
import static java.lang.Math.sqrt;

/**
 * Created by Sky on 16/12/2015.
 */
public class Point {

    double x;
    double y;

    //Create a point from co-ordinates
    public Point(double xVal, double yVal){
        x = xVal;
        y = yVal;
    }

    //Create a point from another point
    Point(final Point oldPoint){
        x = oldPoint.x;
        y = oldPoint.y;
    }

    //Move a Point
    void move(double xDelta, double yDelta){
        x += xDelta;
        y += yDelta;
    }

    //Calculate a distance to a Point passed as a parameter
    double distance(final Point aPoint){
        //Pythagoras
        return sqrt((x-aPoint.x)*(x-aPoint.x) + (y-aPoint.y)*(y-aPoint.y));
    }
    //Create public toString method for use by + String operator
    public String toString(){
        return Double.toString(x) + "," +y;
    }

}
