public class MaximumConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int consOnes = 0;
        int prevConsOnes = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                consOnes++;
            }
            else{
                if(prevConsOnes < consOnes){
                    prevConsOnes = consOnes;
                }
                consOnes = 0;
            }
        }
        if(prevConsOnes < consOnes){
            return consOnes;
        }
        else{
            return prevConsOnes;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

}
