package Geometry2D;

/**
 * Created by Sky on 16/12/2015.
 */
public class Line {
    Point start;
    Point end;

    //Constructor create line from 2 points
    Line(final Point start, final Point end){
        this.start = start;
        this.end = end;
    }

    //Constructor create line from 2 co-ordinate pairs
    Line(double xStart, double yStart, double xEnd, double yEnd){
        start = new Point(xStart, yStart);
        end = new Point(xEnd, yEnd);

    }
    //Calculate the length of a line
    double length(){
        return start.distance(end);
        //Convert to a string


    }

    //Convert to String
    public String toString(){
        return "(" + start + "):(" + end + ")";


    }

    //Return a point as the intersection of two lines
    Point intersects(final Line line1){
        Point localPoint = new Point(0,0);

       //Rest of

        return localPoint;
    }


}
