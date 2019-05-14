import java.lang.Math.*;

public class Circle {

    private double radius;
    private String colour;


    public Circle(){
        this.radius = 1;
        this.colour = "red";
    }

    public Circle(String colour){
        this.radius = 1;
        this.colour = colour;
    }

    public Circle (double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }



    public double getRadius() {

        return radius;
    }

    public String getColour() {

        return colour;
    }


    public double calculateAreaOfCircle(){

        return Math.PI * (radius*radius);
    }

}


//A=πr2