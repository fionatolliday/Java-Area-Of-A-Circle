import java.lang.Math.*;

public class Circle {



    private double radius;
    private String colour;

    public Circle(){
        this.radius = 1;
        this.colour = "red";
    }



    public double getRadius() {

        return radius;
    }

    public String getColour() {

        return colour;
    }


    public double calculateAreaOfCircle(double radius){

        return Math.PI * (radius*radius);
    }

    public void defaultCircle(){
        System.out.println("The default circle has a radius of " + getRadius() + " and a colour " +
                "of " + getColour() + "." + "The area of this circle is " + calculateAreaOfCircle(getRadius()));
    }

    public void circleWithNewColour(){
        colour = "purple";
        System.out.println("This circle has a radius of " + getRadius() + " and a colour " +
                "of " + getColour()  + "." + "The area of this circle is " + calculateAreaOfCircle(getRadius()));
    }

    public void newCircle(){
        colour = "green";
        radius = 9;
        System.out.println("This circle has a radius of " + getRadius() + " and a colour " +
                "of " + getColour() + "." + "The area of this circle is " + calculateAreaOfCircle(getRadius()));
    }

}


//A=πr2