package ch3;
import java.util.*;
public class Quadratic{
    public static double calculate(double a, double b, double c){
        double x=(-b+Math.sqrt(Math.pow(b,2.0)-4.0*a*c))/2.0*a;
        return x;
    }
    public static double calculatenegative(double a, double b, double c){
        double x2=(-b-Math.sqrt(Math.pow(b,2.0)-4.0*a*c))/2.0*a;
        return x2;
    }
    public static void main (String [] args){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a value for a: ");
        double a = in.nextInt();
        System.out.print("Enter a value for b: ");
        double b = in.nextInt();
        System.out.print("Enter a value for c: ");
        double c = in.nextInt();
        
        double x = calculate(a,b,c);
        double x2 = calculate(a,b,c);
        if(Math.pow(b,2.0)<0){
            System.out.print("undefined");
        } else{
            System.out.print(x + " or " + x2);
        }
    }
}