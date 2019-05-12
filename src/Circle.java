import java.lang.Math.*;

public class Circle {

    double radius;
    String colour;

    public Circle(double radius, String colour){
        this.radius = radius;
        this.colour = colour;
    }


    public double calculateAreaOfCircle(){
        return Math.PI * (radius*radius);
    }

}


//A=πr2