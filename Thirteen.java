// Swap values example using function
// this was the example of call by value which means that when you do any changes in the swap function than it will
//  not reflect to the main function 


// java mostly uses call by value functions 
// always the copy of variable is sent to the function and not the real value (imp for call by value)

public class Thirteen{
    public static void swap(int a, int b){
        //swap
        int temp = a; // vlaue of a is stored in temp variable
        a = b;        // value of b is stored in a
        b = temp;     // value of temp is stored in b
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void main(String args[]){
        int a = 5;
        int b = 10;
        swap(a,b);
    }
}