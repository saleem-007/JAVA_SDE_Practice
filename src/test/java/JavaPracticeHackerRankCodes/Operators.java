package JavaPracticeHackerRankCodes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Operators {
    public static void main(String[] args) {

        double meal_cost=12.0;
        double tip_percent=20;
        double tax_percent=8;

        double tip, tax, result;
        tip=((meal_cost/100)*tip_percent);
        tax=((meal_cost/100)*tax_percent);
        result=meal_cost+tip+tax;
        int totalCost = (int) Math.round(result);
        System.out.println(totalCost);
    }
}
