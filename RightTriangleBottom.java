import java.util.Scanner;
public class LeftTriangleBottom {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Rows :");
    int n=sc.nextInt();
String pattern;
        // Right side Right angled triangle bottom
     for(int i=n;i>0;i--)
     {
        pattern="";
        for(int space=n;space>i;space--)
        {
           pattern+=" ";
         }
        for(int j=0;j<i;j++)
        {
          pattern+="*";
         }
        System.out.println(pattern);
      }
       
}
}
