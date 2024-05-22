package IntermediateJAVA.TwoDArray.Programs;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] m1 = {
            {1,2,3},
            {4,5,6}
        };
        int[][] m2 = {
            {1,4},
            {2,5},
            {3,6}
        };
        int[][] product = multiplyMatrices(m1,m2);
        for(int[] row : product){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    private static int[][] multiplyMatrices(int[][] m1, int[][] m2){
        int row1 = m1.length;
        int col1 = m1[0].length;
        int col2 = m2[0].length;
        int[][] product = new int[row1][col2];
        if(m1[0].length == m2.length){
            for(int i = 0; i < row1; i++){
                for(int k = 0; k < col2; k++){ //It will handle the columns of Matrix 2
                    int sum = 0;
                    for(int j = 0; j < col1; j++){ //It will handle the columns of Matrix 1
                        sum += (m1[i][j] * m2[j][k]);
                    }
                    product[i][k] = sum;
                }
            }
            return product;
        }
        return product;
    }
}
