import java.util.*;
public class Main {
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the rows:");
		int row=sc.nextInt();
		for(i=0;i<row;i++){
		    for(j=row;j>i;j--){
		        System.out.print(" ");
		    }
		    if(i==0){
		     System.out.print("*");
		    } else if(i==row-1 ){for(int L=0;L<(2*row-1);L++){
		        System.out.print("*");}
		}else{System.out.print("*");
		for(k=0;k<(2*i-1);k++){System.out.print(" ");
		}System.out.print("*");
		}System.out.println();
		
	}}
}