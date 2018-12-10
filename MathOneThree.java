/**
 * Created by home on 10.12.2018.
 */
public class MathOneThree {

    public static void main(String[] args) {

        Triangle1 first = new Triangle1();
        double b1 = first.b1();
        double h1 = first.h1();
        double n1 = (b1 * h1) / 2;

        Triangle2 second = new Triangle2();
        double b2 = second.b2();
        double h2 = second.h2();
        double n2 = (b2 * h2) / 2;

        if (n1 > n2) {
            System.out.println("Square of Triangle 1 is bigger. This square is " + n1);
        }
        else if (n1 < n2) {
            System.out.println("Square of Triangle 2 is bigger. This square is " + n2);
        }
        else {
            System.out.println("Square of Triangle 1 and 2 is equals: " + n2);
        }

    }

}
