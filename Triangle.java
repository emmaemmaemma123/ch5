package ch3;
import java.util.Scanner;
public class Triangle{
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of stick a: ");
        int a = in.nextInt();
        System.out.print("Enter the value of stick b: ");
        int b = in.nextInt();
        System.out.print("Enter the value of stick c: ");
        int c = in.nextInt();
        
        if(a>b+c || b>a+c || c>a+b){
            System.out.print("You can't make a triangle :(");
        } else {
            System.out.print("You can make a triangle!! :)");
        }
    }
}