import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        A.B ab = new A.B();
        //time();

        System.out.println(Calc.EDUCATIONINDEGREE.action(5,3));


    }

    public static void time() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time e.g. 17:00");
        String time = sc.nextLine();
        switch (time) {
            case "14:00":
                System.out.println(Time.LAUNCH.getValue());
                break;
            case "15:00":
            case "8:00":
                System.out.println(Time.BREAKFAST.getValue());
                break;
            case "17:00":
                System.out.println(Time.DINNER.getValue());
                break;
            default:
                System.out.println("Wrong time!!!");
        }
    }

}