package LinkedList;
import Geometry2D.Point;

/**
 * Created by Sky on 16/12/2015.
 */
public class ListPoint {
    private Point pt;
    private  ListPoint next = null;


    public ListPoint(Point pt){
        this.pt = pt; //Store Point object
        next = null; //Set the next item in list to null terminator
    }

    public void setNext(ListPoint next){
        this.next = next; //Store reference to next ListPoint object

    }

    public ListPoint getNext(){
        return next; //return reference to next ListPoint object
    }

    //Return String representation @Override
    public String toString(){
        return "(" + pt + ")";
    }

}
