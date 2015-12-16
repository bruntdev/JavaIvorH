package sphere;

/**
 * Created by Sky on 15/12/2015.
 */
public class Sphere {

    //Class variables
    static final double PI=3.142;
    static int count=0;

    //instance variables

    double radius = 0.0;
    double xCenter = 0.0;
    double yCenter = 0.0;
    double zCenter = 0.0;

    Sphere(){
        radius = 1.0;
        //Other data members will be zero by default
        ++count; //Update object count
    }

    //Construct unit(one) sphere at designated point
    Sphere(double x, double y, double z){

        this();
        xCenter = x;
        yCenter = y;
        zCenter = z;

    }

    Sphere(double r, double x, double y, double z){
        this(x,y,z);
        radius = r;

        return;

    }

    //Copy constructor

    Sphere(Sphere oldSphere){
        radius = oldSphere.radius;
        xCenter = oldSphere.xCenter;
        yCenter = oldSphere.yCenter;
        xCenter = oldSphere.zCenter;
        ++count;

    }

    // remainder of definition

    // Returns the number of objects created
    public static int getCount() {
        return count;
    }

    // Instance method to return volume
    double volume(){
        return 4.0/3.0*PI*radius*radius*radius;
    }

    // Change instance radius to argument
    void changeRadius(double radius){
        this.radius = radius;
    }

}
