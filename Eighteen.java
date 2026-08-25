// Program to check wether the number is prime or not with functions with corner case

public class Eighteen{
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }

        for(int i=2;i<=n-i;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        System.out.println(isPrime(100));
    }
}