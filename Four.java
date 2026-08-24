// Program for sum of first n natural numbers
import java.util.*;
public class Four{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        int counter = 1;
        int sum = 0;
        
        while(counter <= n){
            sum = sum + counter;
            counter++;
        }
        System.out.println("The sum is " + sum);
    }
}