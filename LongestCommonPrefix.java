public class LongestCommmonPrefix{
    public static void main(String args[]) {
        System.out.print("Finding Longest common prefix.... ");
        String[] arr={"flower","flow","flowers","float"};
        int sortLength=Integer.MAX_VALUE;
        int ptr=-1;
        for(int i=0;i<arr.length;i++){
            if(sortLength>arr[i].length()){
                sortLength=arr[i].length();
            }
        }
        boolean isTrue=true;
        for(int i=0;i<sortLength;i++) {
            for (int j = 0; j < (arr.length-1); j++) {
              if(arr[j].charAt(i) != arr[j + 1].charAt(i)){
                  isTrue=false;
              }
            }
            if(isTrue){
                ptr++;
            }
        }if(ptr>=0) {
            System.out.println(arr[0].substring(0, ptr + 1));
        }else{
            System.out.println("No Longest common prefix ");
        }
    }
}
