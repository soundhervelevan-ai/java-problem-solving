import java.util.Scanner;
public class EvenOrOdd {
	public static void main(String[] args) {
    //Even or odd
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a Number :");
    int a=sc.nextInt();
    
    if((a&1) ==0){
        System.out.println(a+" is an Even Number");
        }
        else{
         System.out.println(a+ " is an Odd Number");
            }		
	}
}