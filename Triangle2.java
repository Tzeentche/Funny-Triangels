import java.util.*;

/**
 * Created by home on 10.12.2018.
 */
public class Triangle2 {
    public double base2;
    public double high2;

    //
    public double b2() {
        double paramb2 = base2;

        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Please, enter value of base second triangle");
            paramb2 = in.nextDouble();
        }   catch (InputMismatchException e) {
            System.out.println("Wrong value of base");
            paramb2 = 1;
        }
        if (paramb2 < 0) {
            System.out.println("No-no-no! The value must be positive!");
            paramb2 = paramb2 * -1;
        }
        if (paramb2 == 0) {
            System.out.println("No-no-no! The value must be higher than 0!");
            paramb2 = 1;
        }
        return paramb2;
    }

    //
    public double h2() {
        double paramh2 = high2;

        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Please, enter value of high second triangle");
            paramh2 = in.nextDouble();
        }   catch (InputMismatchException e) {
            System.out.println("Wrong value of base");
            paramh2 = 1;
        }
        if (paramh2 < 0) {
            System.out.println("No-no-no! The value must be positive!");
            paramh2 = paramh2 * -1;
        }
        if (paramh2 == 0) {
            System.out.println("No-no-no! The value must be higher than 0!");
            paramh2 = 1;
        }
        return paramh2;
    }
}
