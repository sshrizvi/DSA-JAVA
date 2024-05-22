package IntermediateJAVA.TwoDArray.Programs;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6}
        };
        int[][] trans = transpose2DArray(arr);
        for(int[] row : trans){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    private static int[][] transpose2DArray(int[][] arr) {
        int[][] trans = new int[arr[0].length][arr.length];

        //Logic
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                trans[j][i] = arr[i][j];
            }
        }
        return trans;
    }
}
