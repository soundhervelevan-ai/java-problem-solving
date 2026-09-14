public class FirstAndLastPos{
    public static void main(String[] args){
        int[] nums={1,1,2,2,2,3,3};
        int target=2;
        int right=nums.length-1;
        int left=0;
        int lp=-1,rp=-1;
        while(left<=right){
            //shifting or checking left
            if(nums[left]<target){
                left++;
            }
            if(target==nums[left]){
                lp=left;
            }
            if(target==nums[right]){
                rp=right;
            }
            if(nums[right]>target){
                right--;
            }
            if(lp!=-1 && rp!=-1){
                break;
            }
        }
        System.out.println("["+lp+","+rp+"]");
    }
}
