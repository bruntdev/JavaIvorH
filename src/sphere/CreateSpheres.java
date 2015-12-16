package sphere;

/**
 * Created by Sky on 16/12/2015.
 */
public class CreateSpheres {

    public static void main(String[] args) {
        System.out.println("Number of objects =" + Sphere.getCount());
        Sphere ball = new Sphere(4.0,0.0,0.0,0.0);
        System.out.println("Number of objects =" + Sphere.getCount());
        Sphere globe = new Sphere(12, 1.0,1.0,1.0); //Create a sphere
        System.out.println("Number of objects =" + Sphere.getCount());
        Sphere copyglobe = new Sphere(globe);
        //Output the volume of each sphere
        System.out.println("ball volume = " + ball.volume());
        System.out.println("globe volume = " + globe.volume());
        System.out.println("copyglobe volume = " + copyglobe.volume());

    }
}
