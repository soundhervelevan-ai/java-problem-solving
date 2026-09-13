import java.util.Scanner;
public class NoRepeatChar{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String 1 : ");//add
        String str = sc.next().trim();
        str=str.toLowerCase();
        char noRepeat='a';
        for(int i=0;i<26;i++){
            int repeatCount=0;
            for(int j=0;j<str.length();j++){
                if(noRepeat==str.charAt(j)){
                    repeatCount++;
                }
            }
            if (repeatCount == 1) {
                System.out.println("The character '"+noRepeat+"' is not repeated in the given String ");
                break;
            }
            noRepeat++;
        }

    }
}
