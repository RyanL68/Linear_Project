import java.util.Scanner;

public class equationrunner {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String coord1;
        String coord1L;
        String coord1R;
        String coord2;
        String coord2L;
        String coord2R;

        int comma;
        int x1, y1;
        int x2, y2;
        double NewX;


        System.out.println("Welcome!");


        System.out.print("Enter coordinate 1: ");
        coord1 = scan.nextLine();
        comma = coord1.indexOf(",");


        coord1L = coord1.substring(1, comma);
        coord1R = coord1.substring(comma + 1, coord1.length() - 1);
        x1 = Integer.parseInt(coord1L);
        y1 = Integer.parseInt(coord1R);


        System.out.print("Enter coordinate 2: ");
        coord2 = scan.nextLine();
        comma = coord2.indexOf(",");


        coord2L = coord2.substring(1, comma);
        coord2R = coord2.substring(comma+ 1, coord2.length() - 1);
        x2 = Integer.parseInt(coord2L);
        y2 = Integer.parseInt(coord2R);


        if (x2 == x1) {
            System.out.println("These points are on a vertical line: x = " + x1);
        } else {
            Linearequation linear = new Linearequation(x1, y1, x2, y2);
            System.out.println("Your points are: "+coord1+" and "+coord2);
            System.out.println("The slope of this line is: "+linear.slope());
            System.out.println("The Y-intercept of the line is: "+linear.yintercept());
            System.out.println("The distance between the points is: "+linear.distance());
            System.out.println("");

            System.out.println("\nEnter a value for x: ");
            NewX = scan.nextDouble();
            linear.Newcoords(NewX);
        }

    }
}