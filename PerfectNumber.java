import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.print("Enter a Number to check :");
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        char c='a';
        c++;
        System.out.println(c);
            if(sum==n){
                System.out.println("Perfect");
            }else{
                System.out.println("Not a perfect Number ");
            }
    }
}
