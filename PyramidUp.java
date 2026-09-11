import java.util.Scanner;
public class PyramidUp{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Rows :");
    int n=sc.nextInt();
    //Up pyramid
    for(int i=n;i>0;i--)
    {
            String pattern="";
              for(int s=0;s<i-1;s++)
              {
                pattern+=" ";
              }
              for(int j=0;j<=2*(n-i);j++)
              {
                pattern+="*";
              }
             System.out.println(pattern);
    }
  }
}
