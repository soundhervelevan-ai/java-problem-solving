import java.util.Scanner;
public class StringPalindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str=sc.nextLine().trim();
        String reverse="";
        int length=str.length();
        str=str.toLowerCase();
        for(int i=length-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("The Given String is Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
