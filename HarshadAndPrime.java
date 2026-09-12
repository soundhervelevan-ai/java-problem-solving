import java.util.Scanner;
public class HarshadAndPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean isHarshad=false;
        boolean isPalindrome=false;
        System.out.println("Enter a Number : ");
        int N=sc.nextInt();
        int n=N;
        int PSum=0;
        int Hsum=0;
        while(n>0){
           int last=n%10;
           PSum=PSum*10+last;
           Hsum=Hsum+last;
           n/=10;
        }
        if(PSum==N){
            isPalindrome=true;
        }
        if(N%Hsum==0){
            isHarshad=true;
        }int x=0;
        if(isPalindrome && isHarshad){
         x=1;
        }
        else if(isPalindrome){
            x=3;
        }
        else if(isHarshad){
            x=2;
        }
        else{
            x=4;
        }
        String ans=switch(x){
            case 1 ->"Both";
            case 2 ->"isHarshad";
            case 3 ->"palindrome";
            case 4 ->"Nothing";
            default ->"";
        };
        System.out.println(ans);
    }
}
