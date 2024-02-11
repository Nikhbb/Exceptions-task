package app.view;

import java.util.Scanner;

public class AirRangeView {

    public int dataInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input height, meters: ");
        return sc.nextInt();
    }

    public void printAirIndicator(String airRange) {
        System.out.println("Output result: " + airRange);
    }

}
