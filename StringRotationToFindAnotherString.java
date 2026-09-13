import java.lang.StringBuilder;
public class StringRotationToFindAnotherString{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String 1 : ");//add
        StringBuilder word;
        StringBuilder word2;
        boolean isFound=false;
        word=new StringBuilder(sc.next().toLowerCase());
        System.out.print("Enter a String 2 : ");
        word2=new StringBuilder(sc.next().toLowerCase());
        if(word.length()==word2.length()) {
            for (int i = 0; i < word.length(); i++) {
                char temp = word.charAt(0);
                for (int j = 0; j < word.length() - 1; j++) {
                    word.setCharAt(j, word.charAt(j + 1));
                }
                word.setCharAt(word.length() - 1, temp);
                if ((word.toString()).equals(word2.toString())) {
                    isFound = true;
                    break;
                }
            }
        }
        if(isFound){
            System.out.println("The Element is found by rotating the string ");
        }
        else{
            System.out.println("The Element is not found by rotation");
        }
    }
}
