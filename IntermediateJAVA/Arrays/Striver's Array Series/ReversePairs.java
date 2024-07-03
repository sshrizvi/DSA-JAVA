public class ReversePairs{
    public static int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }
    public static int merge(int nums[], int l, int m, int r){
        int i = l;
        int j = m + 1;
        int k = 0;
        int[] temp = new int[r - l + 1];
        int rpCount = 0;

        // Main Logic for Counting Reverse Pairs
        while(i <= m){
            while(j <= r && nums[i] > (2 * (long) nums[j])){
                j++;
            }
            rpCount += (j - (m + 1));
            i++;
        }

        // Merge Logic
        i = l;
        j = m + 1;
        while(i <= m && j <= r){
            if(nums[i] <= nums[j]) temp[k++] = nums[i++];
            else temp[k++] = nums[j++];
        }
        while(i <= m) temp[k++] = nums[i++];
        while(j <= r) temp[k++] = nums[j++];
        
        for(i = l; i <= r; i++){
            nums[i] = temp[i - l];
        }
        
        return rpCount;
    }
    public static int mergeSort(int nums[], int l, int r){
        int rpCount = 0;
        if(l < r){
            int mid = (l + r) / 2;
            rpCount += mergeSort(nums, mid + 1, r);
            rpCount += mergeSort(nums, l, mid);
            rpCount += merge(nums, l, mid, r);
        }
        return rpCount;
    }
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        System.out.println(reversePairs(nums));
    }
}