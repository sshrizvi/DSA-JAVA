import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        ArrayList<int[]> output = new ArrayList<>();
        // Sorting Matrix - Intervals
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // Logic
        for(int i = 0; i < intervals.length-1; i++){
            if(intervals[i+1][0] >= intervals[i][0] && intervals[i+1][0] <= intervals[i][1]){
                intervals[i+1][0] = Math.min(intervals[i][0], intervals[i+1][0]);
                intervals[i+1][1] = Math.max(intervals[i][1], intervals[i+1][1]);
                intervals[i][0] = -1;
                intervals[i][1] = -1;
            }
        }
        // Retreiving the Merged Intervals
        for(int i = 0; i < intervals.length; i++){
            if(intervals[i][0] == -1 && intervals[i][1] == -1) continue;
            output.add(new int[]{intervals[i][0], intervals[i][1]});
        }
        // Converting the ArrayList to 2D matrix
        int[][] mergedList = convertTo2DArray(output);
        // Return Statement
        return mergedList;
    }

    public static int[][] convertTo2DArray(ArrayList<int[]> list) {
        if (list.isEmpty()) {
            return new int[0][0];
        }
        int rowCount = list.size();
        int colCount = list.get(0).length; // Assuming all rows have the same number of columns
        int[][] matrix = new int[rowCount][colCount];
        for (int i = 0; i < rowCount; i++) {
            matrix[i] = list.get(i);
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] intervals = {{8,10},{2,6},{1,3},{15,18}};
        int[][] output = merge(intervals);
        for(int[] interval : output){
            for(int x : interval){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
