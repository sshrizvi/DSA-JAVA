public class MinimumJumps {
    static int minJumps(int[] arr, int n) {
        int jumps = 0;
        int steps = 0, maxReach = arr[0];
        int max = 0;
        while(steps <= maxReach){
            if(arr[maxReach + steps] + (maxReach + steps) > max) max = arr[maxReach + steps];
            if(steps == maxReach){
                maxReach = max;
                jumps++;
                steps = 0;
            }
            steps++;
        }
        return jumps;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr, arr.length));
    }
}
