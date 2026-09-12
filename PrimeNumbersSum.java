import java.util.Scanner;
public class PrimeNumbersSum {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a Number to sum the prime numbers between 1 to N :");
	int n=sc.nextInt();
	int sum=0;
   for(int i=1;i<=n;i++){
      boolean flag=true;
      if(i==1){
           continue;
      }
      for(int j=3;j<i;j+=2){
         
         if(i!=2 && (i&1)==0){   flag=false;
             break;
             //if even break
         }
      if(i%j==0){
          flag=false;
          break;
      }
   
   
   
      }
      if(flag){
          sum=sum+i;
          System.out.println("The Number "+i+" is Prime Number");
      }
   }
   System.out.println("The sum of Prime numbers upto "+ n+" is "+sum);
	}
}