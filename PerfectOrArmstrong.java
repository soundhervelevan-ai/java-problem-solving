import java.util.Scanner;
public class  PerfectOrArmstrong{
    public static void main(String[] args) {
        // Your Code goes here!
               Scanner sc=new Scanner(System.in);
               boolean isArmstrong=false;
               boolean isPerfect=false;
               boolean isEven=true;
               int root=0;
               System.out.print("Enter a Number to check even,odd,Armstrond,perfect and digital roots :");
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
              //even or odd
              if((N&1)!=0){
                isEven=false;
              }
              //digital root
              if(N%9==0){
                root=0;
              }
              else if(N==0){
                root=0;
              }
              else{
                root=N%9;
              }
              System.out.println("The Digital Root is "+ root);
          if(isPerfect && isArmstrong && isEven){
            System.out.print("Even,Perfect and Armstrong");
          }
          else if(isPerfect && isArmstrong && (!isEven)){
            System.out.print("odd,Perfect and Armstrong");
          }
          else if(isPerfect && isEven){
            System.out.print("Perfect and Even ");
          } else if(isPerfect && (!isEven)){
            System.out.print("Perfect and odd ");
          }
          else if(isArmstrong  && isEven){
            System.out.print("Armstrong and Even");
          }
           else if(isArmstrong  && (!isEven)){
            System.out.print("Armstrong and Odd");
          }
          else if(isPerfect|| isArmstrong){
            System.out.print("Perfect or Armstrong");
          }
          else{
            if(isEven){
              System.out.print("Even");
            }else{
              System.out.print("Odd");
            }
            
          }
           
          
    }
}
