package Test;

import java.sql.Timestamp;
import java.util.*;


class test1 {
    public static void main(String[] args) {
        double A0 = 1.45;
        double A = 0.9695;
        double _A = 0.6482;
        double t = 21.3;
        double _t = 42.6;
        printOutput(A0, A, _A, t, _t);

        System.out.println("Inst Rate is: " + getInstRate(1, 2.65, 0.004790074, 336));
    }

    private static double getOrderZero(double A, double A0, double t){
        return (A0-A)/t;
    }

    private static double getOrderOne(double A, double A0, double t){
        double temp = (Math.log(A/A0))/t;
        return -1 * temp;
    }

    private static double getOrderTwo(double A, double A0, double t){
        double _A = 1/A;
        double _A0 = 1/A0;

        double temp = (_A - _A0);
        return temp/t;
    }

    private static double getInstRate(int order, double A0, double k, double t){
        if(order == 0){
            return -1 * k;
        }else if(order == 1){
            double temp = k * A0 * Math.exp(-1 * k * t);
            return -1 * temp;
        }else if(order == 2){
            double base = k * t + 1/A0;
            double temp = Math.pow(base, -2);
            return -1 * temp * k;
        }
        return -1;
    }

    private static void printOutput( double A0, double A, double _A, double t, double _t){
        System.out.println("=== Order Zero");
        System.out.println(getOrderZero(A, A0, t));
        System.out.println(getOrderZero(_A, A0, _t));
        System.out.println("");


        System.out.println("=== Order One");
        System.out.println(getOrderOne(A, A0, t));
        System.out.println(getOrderOne(_A, A0, _t));
        System.out.println("");


        System.out.println("=== Order Two");
        System.out.println(getOrderTwo(A, A0, t));
        System.out.println(getOrderTwo(_A, A0, _t));

    }
}
