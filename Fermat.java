package ch3;
import java.util.Scanner;
public class Fermat{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value for a: ");
        int a = in.nextInt();
        System.out.print("Enter a value for b: ");
        int b = in.nextInt(); 
        System.out.print("Enter a value for c: ");
        int c = in.nextInt();
        System.out.print("Enter a value for n: ");
        int n = in.nextInt();
        
        if (n>2 && Math.pow(a,n) + Math.pow(b,n)==Math.pow(c,n)){
            System.out.print("Holy smokes, Fermat was wrong!");
        } else{
            System.out.print("No, that doesn't work.");
        }
        
    }
}