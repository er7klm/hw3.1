package com.company;

public class Main {

    public static void main(String[] args) {

        double[] numb = {3.2, 1.1, -7.7, 30.3, -21.6, 42.2, -8.3,
                -12.5, 64.4, 9.9, 47.8, -20.5, -11.3, 53.7, 77.1};
        double summa = 0;
        double i = 0;
        boolean otr = false;

        for (double k : numb) {
            if (k < 0) {
                otr = true;
            } else {
                if (otr) {
                    i++;
                    summa += k;
                }
            }
        }

        System.out.println(summa / i);
    }
}
