import java.util.Scanner;
public class FrequencyOfString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str=sc.nextLine().trim();
        char c='A';
        for(int i=0;i<52;i++){
            int frequency=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==' ')
                    continue;
                if(c==str.charAt(j)){
                    frequency++;
                }
            }
            if(frequency!=0){
                System.out.println("Frequency of the character "+c+ "is"+frequency);
            }
            if(c=='Z'){
                c='a';
            }else{
                c++;
            }

        }
    }
}
