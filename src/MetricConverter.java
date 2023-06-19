import java.util.Scanner;
public class MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meters = 0.0;
        double miles =0.0;
        double feet = 0.0;
        double inches = 0.0;
        String trash = "";
        boolean done = false;
        do {
            System.out.println("Enter a measurement in meters: ");
            if(in.hasNextDouble()){
                meters = in.nextDouble();
                in.nextLine();
                if (meters!=0){done = true;}
                else {
                    System.out.println("Please enter a value different from 0!");
                }
            }
            else {
                trash = in.nextLine();
                System.out.println("Please enter a valid number, not: " + trash);
            }
        }
        while(!done);
        double MILES_PER_METER = 0.00062;
        double FEET_PER_METER = 3.28084;
        double INCHES_PER_METER = 39.3701;
        //convert meters
        miles = meters * MILES_PER_METER;
        feet = meters * FEET_PER_METER;
        inches = meters * INCHES_PER_METER;
        //out put result
        System.out.println("Miles: " + miles);
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);
    }
}