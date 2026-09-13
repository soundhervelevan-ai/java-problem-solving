import java.util.Scanner;
public class CountContinuesRepeat{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String 1 : ");//add
        String str = sc.next().trim();
        str=str.toLowerCase();
        int count=1;
        for(int i=0;i<str.length();i+=count){
            count=1;
            for(int j=i;j<str.length();j++){
                if(j+1!=str.length()) {
                    if (str.charAt(j) == str.charAt(j + 1)) {
                        count++;
                    } else {
                        break;
                    }
                }
            }
            System.out.print(str.charAt(i)+""+count);
        }
    }
}
