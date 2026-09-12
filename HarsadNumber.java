import java.util.Scanner;
public class HarsadNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n=sc.nextInt();
        int N=n;
        int sum=0;
        while(n>0){
        int last=n%10;
         sum=sum+last;
         n/=10;
        }
        if(N%sum==0){
        System.out.println("Harsad Number");
        }else{
        System.out.println("Not Harsad Number");
       }
    }
}
