package app.view;

import java.util.Scanner;

import static app.helper.HeightValue.MAX_HEIGHT;
import static app.helper.HeightValue.MIN_HEIGHT;

public class AirRangeView {

    public int dataInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input height, meters from " + MIN_HEIGHT.getValue() + " to " + MAX_HEIGHT.getValue() + ": ");
        return sc.nextInt();
    }

    public void printAirIndicator(String airRange) {
        System.out.println("Output result: " + airRange);
    }

}
