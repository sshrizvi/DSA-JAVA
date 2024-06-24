import java.util.Arrays;

public class MergeSortedArray {

    // Most Optimal Solution - Backward Merging
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    // Syed's Solution
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0, p2 = 0;
        if(n == 0) return;
        while(p1 < m){
            if(nums1[p1] <= nums2[p2]) p1++;
            else {
                int temp = nums1[p1];
                nums1[p1] = nums2[p2];
                nums2[p2] = temp;
                p1++;
                int i = 0;
                while(i < n-1){
                    if(nums2[i] < nums2[i+1]) break;
                    else{
                        temp = nums2[i];
                        nums2[i] = nums2[i+1];
                        nums2[i+1] = temp;
                        i++;
                    }
                }
            }
        }
        while(p2 < n){
            nums1[p1] = nums2[p2];
            p1++;
            p2++;
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge2(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}