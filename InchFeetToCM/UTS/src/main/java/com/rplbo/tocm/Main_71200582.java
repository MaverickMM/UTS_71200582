package com.rplbo.tocm;

public class Main_71200582 {
    public double feet;
    public double inch;

    public static double FeetIncToCm(double inch) {
        if (inch > 0) {
            double centimeter;
            int inch1 = (int) inch;
            double covert = inch / 12;
            double hasil1 = (int) covert;
            double converround1 = covert - hasil1;
            double hasil2 = converround1 * 12;
            System.out.println(inch1 + " Inc" + " = " + hasil1 + " Feet " + hasil2 + " Inc ");
            double hasil = Main_71200582.FeetIncToCm(hasil1, hasil2);
            centimeter = hasil;
            return centimeter;
        } else {
            return -1;
        }
    }

    public static double FeetIncToCm(double feet, double inch){
        if(feet >0 && inch >0 && inch <=12){
            double centimeter;
            double centimeter1 = 30.48 * feet;
            double centimeter2 = 2.54 * inch;
            centimeter = centimeter1 + centimeter2;
            System.out.println("Nilai dalam centimeter: " + centimeter + " cm");
            return 0;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {

        FeetIncToCm(1,3);
        FeetIncToCm(15);





    }

}
