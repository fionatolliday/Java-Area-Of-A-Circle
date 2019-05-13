import java.lang.Math.*;

public class Circle {



    private double radius;
    private String colour;


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColour(String colour) {
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