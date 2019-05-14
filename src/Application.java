public class Application {

    public static void main(String[] args){

        Circle defaultCircle = new Circle();
        Circle secondCircle = new Circle("purple");
        Circle thirdCircle = new Circle(4, "green");

        System.out.println("The radius is :" + defaultCircle.getRadius());
        System.out.println("The colour is: " + defaultCircle.getColour());
        System.out.println("The area is: " + defaultCircle.calculateAreaOfCircle());

        System.out.println("The radius is :" + secondCircle.getRadius());
        System.out.println("The colour is: " + secondCircle.getColour());
        System.out.println("The area is: " + secondCircle.calculateAreaOfCircle());

        System.out.println("The radius is :" + thirdCircle.getRadius());
        System.out.println("The colour is: " + thirdCircle.getColour());
        System.out.println("The area is: " + thirdCircle.calculateAreaOfCircle());

    }

}


//    I would like to know the radius and color of the circle.
//    By default radius =1 ,
//    color = red
//    but creator should be able to modify the radius.
//    The program should be able to output:
//    the default values ,
//    changed value of radius given by user and
//    then calculate the area


//objectives:
//print the radius
//print the area of the circle
//print the colour of the circle
//
//no scanner input
//hard code the value
//
//
//        To clarify: print the radius, area of circle and colour each time.
//        No scanner input. Just hard code the values.