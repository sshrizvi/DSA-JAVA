import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        int[][] matrix = new int[numRows][numRows];
        for(int i = 0; i < numRows; i++){
            int f = i, s = 0;
            List<Integer> currentList = new ArrayList<>();
            while(f >= 0 && s <= i){
                if(f == 0 || s == 0) matrix[f][s] = 1;
                else matrix[f][s] = matrix[f][s-1] + matrix[f-1][s];
                currentList.add(matrix[f][s]);
                f--;
                s++;
            }
            triangle.add(currentList);
        }
        return triangle;
    }
    public static void main(String[] args) {
        int numRows = 5;
        System.out.println((generate(numRows)));
    }
}
