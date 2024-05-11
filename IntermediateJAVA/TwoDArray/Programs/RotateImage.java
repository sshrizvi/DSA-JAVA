package IntermediateJAVA.TwoDArray.Programs;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        rotateImage(matrix);
        for(int[] row : matrix){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    private static void rotateImage(int[][] matrix) {
        int n = matrix.length;

        //Logic
        // Reversing the columns for clockwise rotation Else reverse the rows for anti-clockwise rotation
        for(int col = 0; col < n; col++){
            int i = 0;
            int j = n-1;
            while(i <= j){
                int temp = matrix[i][col];
                matrix[i][col] = matrix[j][col];
                matrix[j][col] = temp;
                i++;
                j--;
            }
        }

        //Transposing the Array
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                if(row > col){
                    int temp = matrix[row][col];
                    matrix[row][col] = matrix[col][row];
                    matrix[col][row] = temp;
                }
            }
        }

    }
}
