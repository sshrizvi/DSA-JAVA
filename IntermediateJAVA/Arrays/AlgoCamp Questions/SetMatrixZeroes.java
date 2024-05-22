package IntermediateJAVA.TwoDArray.Programs;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {3,4,5},
            {6,7,8}
        };
        setMatrixZeroes(matrix);
        for(int[] row : matrix){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    private static void setMatrixZeroes(int[][] matrix) {

        //Logic
        boolean isCol = false;
        boolean isRow = false;
        //Finding Zeroes and Marking Rows and Columns
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(i == 0 && matrix[i][j] == 0){
                    isRow = true;
                }
                if(j == 0 && matrix[i][j] == 0){
                    isCol = true;
                }
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0; //Marking starting of row as Zero
                    matrix[0][j] = 0; //Marking starting of column as Zero
                }
            }
        }
        //Filling Zeroes in the marked rows and columns
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[i][0] == 0 || matrix [0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(matrix[0][0] == 0){
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[0].length; j++){
                    if((i == 0 && isRow) || (j == 0 && isCol)){
                        matrix[i][j] = 0;
                    }
                }
            }
        }

    }
}
