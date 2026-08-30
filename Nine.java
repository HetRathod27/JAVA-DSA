//check if number is prine or not

import java.util.*;
public class Nine{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //boolean isPrime = true;

        if(n == 2){
            System.out.println("Prime number");
        }else{
            boolean isPrime = true;
            for(int i = 2; i <= n-1; i++){
                if(n % i == 0){
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println("prime number");
            }else{
                System.out.println("not prime");
            }
        }
    }
}