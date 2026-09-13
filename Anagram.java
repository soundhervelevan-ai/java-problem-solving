import java.util.Scanner;
public class Anagram{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String 1 : ");//add,listen
        String str = sc.next().trim();
        System.out.print("Enter a String 2 : ");//dad,silent
        String str2 = sc.next().trim();
        str = str.toLowerCase();
        str2= str2.toLowerCase();
        boolean isAnagram = true;
        if (str.length() != str2.length()) {
            isAnagram = false;
        } else {
            char check='a';
            for (int i = 0; i < 26; i++) {
                int str1Count=0;
                int str2Count=0;
                    for(int j=0;j<str.length();j++){
                        if(check==str.charAt(j)){
                            str1Count++;
                        }
                    }
                for(int j=0;j<str2.length();j++){
                    if(check==str2.charAt(j)){
                        str2Count++;
                    }
                    if(str1Count!=str2Count){
                        isAnagram=false;
                        break;
                    }
                }
            }
        }
        if(isAnagram){
            System.out.println("The given Strings "+str+" and "+ str2+" is Anagram");
        }
        else{
            System.out.println("The given Strings are not in Anagram");
        }
    }
}
