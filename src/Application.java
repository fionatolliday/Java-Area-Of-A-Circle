public class Application {

    public static void main(String[] args){

        Circle defaultCircle = new Circle(1, "red");
        Circle changedCircle = new Circle(9, "red");

        System.out.println("The radius of " + "the default circle " + "is " + defaultCircle.radius +
                " and the colour is " + defaultCircle.colour + ".");

        System.out.println("The area of the default circle is " + defaultCircle.calculateAreaOfCircle());

        System.out.println("The radius of " + "the new circle " + "is " + changedCircle.radius +
                " and the colour is " + changedCircle.colour + ".");

        System.out.println("The area of the new circle is " + changedCircle.calculateAreaOfCircle());
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