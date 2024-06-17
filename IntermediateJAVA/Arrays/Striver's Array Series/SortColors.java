import java.util.Arrays;

public class SortColors {
    public static void sortColors(int[] nums) {
        int red = 0, i = 0, blue = nums.length-1;
        while(i <= blue){
            if(nums[i] == 2){ // Handling Blue Objects
                int temp = nums[i];
                nums[i] = nums[blue];
                nums[blue] = temp;
                blue--;
            }
            else if(nums[i] == 0){ // Handling Red Objects
                int temp = nums[i];
                nums[i] = nums[red];
                nums[red] = temp;
                red++;
                i++;
            }
            else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] colors = {2,0,2,1,1,0};
        sortColors(colors);
        System.out.println(Arrays.toString(colors));
    }
}
