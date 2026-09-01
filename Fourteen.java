// Product of a and b using function

public class Fourteen{
    public static int multiply(int a, int b){
        int product = a*b;
        return product; 
    }
    public static void main(String args[]){
        int a = 10;
        int b = 10;
        int prod = multiply(a,b);
        System.out.println("product is " +prod);
    }
} 