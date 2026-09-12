import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a Number :");  
	int a=sc.nextInt();
	int refrence=a;
	for(int i=0;i<10;i++){
	    int count=0;
	    int last;
	while(a>0){
	   last=a%10;
	   if(last==i){
	       count++;
	   }
	   a/=10;
	    }
	    //outside for
	    
	    a=refrence;
	   System.out.println("The frequencybof Number "+i+" is "+count);	
	}}
}