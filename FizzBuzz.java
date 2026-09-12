import java.util.Scanner;
public class FizzBuzz{
    public static void main(String[] args) {
        System.out.print("Enter a number :");
        Scanner scan=new Scanner(System.in);
        int fizzBuzz=scan.nextInt();
        for(int i=1;i<=fizzBuzz;i++){
        if(i%3==0 && i%5==0){
            System.out.println("FizzBus");
        }else if(i%5==0 && i%3!=0){
            System.out.println("fizz");
        }else if(i%5!=0 && i%3==0){
            System.out.println("Bus");
        }else {
            System.out.println(i);
        }
        }
    }
}