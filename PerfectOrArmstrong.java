import java.util.Scanner;
public class PerfectOrArmstrong {
    public static void main(String[] args) {
        // Your Code goes here!
               Scanner sc=new Scanner(System.in);
               boolean isArmstrong=false;
               boolean isPerfect=false;
               int N=sc.nextInt();
               //Armstrong
               //to find digits
               int digit=(int)Math.log10(N*10);
               int n=N;int sum=0;
               while(n>0){
                int last=n%10;
                int pow=last;
                for(int i=1;i<digit;i++){
                    pow=pow*last;
                }
                n/=10;
                sum=sum+pow;
               }n=N;
               if(N==sum){
                isArmstrong=true;
               }sum=0;
               //perfect Number
                for(int i=1;i<N;i++){
                    if(N%i==0){    
                        sum=sum+i; 
                    }
                }
                if(sum==N){
                    isPerfect=true;
                }
      //conditions to detect either or
          if(isPerfect && isArmstrong){
            System.out.println("Both Perfect and Armstrong");
          }
          else if(isPerfect){
            System.out.println("Perfect ");
          }else if(isArmstrong){
            System.out.println("Armstrong ");
          }
          else if(isPerfect|| isArmstrong){
            System.out.println("Perfect or Armstrong");
          }
          else{
            System.out.println("Nothing");
          }
    }
}
