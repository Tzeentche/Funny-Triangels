import java.util.*;
/**
 * Created by home on 10.12.2018.
 */
public class Triangle1 {
    public double base1;
    public double high1;

    //
    public double b1() {
        double paramb1 = base1;

        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter value of base first triangle");
            paramb1 = in.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Wrong value of base");
            paramb1 = 1;
        }
        if (paramb1 < 0) {
            System.out.println("No-no-no! The value must be positive!");
            paramb1 = paramb1 * -1;
        }
        if (paramb1 == 0) {
            System.out.println("No-no-no! The value must be higher than 0!");
            paramb1 = 1;
        }
        return paramb1;
    }

    //
    public double h1() {
        double paramh1 = high1;

        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter value of high first triangle");
            paramh1 = in.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Wrong value of high");
            paramh1 = 1;
        }
        if (paramh1 < 0) {
            System.out.println("No-no-no! The value must be positive!");
            paramh1 = paramh1 * -1;
        }
        if (paramh1 == 0) {
            System.out.println("No-no-no! The value must be higher than 0!");
            paramh1 = 1;
        }
        return paramh1;
    }

}
