package IntermediateJAVA.TwoDArray.Programs;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        ArrayList<Integer> output = new ArrayList<>();
        output = spiralOrder(matrix);
        System.out.println(output);
    }

    private static ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> spiral = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int start_row = 0;
        int start_col = 0;
        int last_row = m - 1;
        int last_col = n - 1;

        int count = m * n;
        //Logic
        while (count >= 0) {
            for(int i = start_col; i <= last_col; i++){ //Starting Row
                spiral.add(matrix[start_row][i]);
                count--;
            }      
            start_row++;  
            if (count == 0) break;
            for(int i = start_row; i <= last_row; i++){ //Last Column
                spiral.add(matrix[i][last_col]);
                count--;
            }
            last_col--;
            if (count == 0) break;
            for(int i = last_col; i >= start_col; i--){ //Last Row
                spiral.add(matrix[last_row][i]);
                count--;
            }
            last_row--;
            if (count == 0) break;
            for(int i = last_row; i >= start_row; i--){ //Starting Column
                spiral.add(matrix[i][start_col]);
                count--;
            }
            start_col++;
            if (count == 0) break;
        }
        return spiral;
    }
}
