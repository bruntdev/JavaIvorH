package LinkedList;

import Geometry2D.Point;

import java.io.StreamTokenizer;
//import java.lang.Math.*;

/**
 * Created by Sky on 18/12/2015.
 */
public class tryLinkedList {


    public static void main(String[] args) {
        final int range = 10;
        ListPoint head = null;
        ListPoint current = null;
        ListPoint temp = null;
        ListPoint walk = null;

        //Set up array of points to test LinkedList
        Point[] ap1 = new Point[6];
        for(int i=0; i < 6 ; i++){
            ap1[i] = new Point(range*Math.random(),range*Math.random());
            System.out.println(ap1[i]);

        //Initialize and Populate LinkedList



    }

        for (Point x : ap1 ){
            if (current == null){
                current = new ListPoint(x);
                head = current;
            }
            else {
                temp= new ListPoint(x);
                current.setNext(temp);
                current = temp;

            }
        }

        // Walk through LinkedList
        System.out.println("Walking List");
        walk = head;
        while(walk != null){
            System.out.println(walk);
            walk = walk.getNext();

        }

    }
}
 //class myStream extends StreamTokenizer(){}

