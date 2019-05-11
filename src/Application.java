public class Application {

    public static void main(String[] args){

        Circle fionasCircle = new Circle(1, "red");

        System.out.println("The radius of " + "Fiona's circle " + "is " + fionasCircle.radius +
                " and the colour is " + fionasCircle.colour + ".");
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