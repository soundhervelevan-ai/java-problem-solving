import java.util.Scanner;
public class ConsecutiveZerosBitwise {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter a Number :");
     int n=sc.nextInt();
     int count=0;int i=1;
     int max=0;
     while(n>0){
      if((n & i)==0){
        count++;
      }
      else if((n& i)!=0){
        count=0;
      }
      if(count>max){
        max=count;
      }
      n=n>>1;
     }
    
     System.out.println(max);
    }
    }
