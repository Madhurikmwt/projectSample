package org.example;
//Implement(x,n)
public class Power {
    public static void pow(double x,int n){
        if(n<0){
            System.out.println(1/power(x,-n));
        }else{
            System.out.println(power(x,n));
        }
    }

    public static double power(double x,int n){
        if(n==1){
            return x;
        }
        if(n==0){
            return 1;
        }

        double v = power(x,n/2);

        if(n%2 == 0){
            return v*v;
        }else {
            return v*v*x;
        }
    }
}

