public class Search2DMatrix{
    private static boolean search(int[][] matrix, int target) {
        int m = matrix.length; 
        int n = matrix[0].length;
        int lrow = 0, rrow = m-1, mrow = (lrow+rrow)/2;
        while(lrow <= rrow){
            if(target < matrix[mrow][0]){
                rrow = mrow-1;
                mrow = (lrow+rrow)/2;
            }
            else if(target > matrix[mrow][n-1]){
                lrow = mrow+1;
                mrow = (lrow+rrow)/2;
            }
            else if(target >= matrix[mrow][0] && target <= matrix[mrow][n-1]){
                int l = 0;
                int r = n-1;
                int mid = (l+r)/2;
    
                while(l <= r){
                    if(matrix[mrow][mid] == target) return true;
                    else if(matrix[mrow][mid] < target){
                        l = mid+1;
                        mid = (l+r)/2;
                    }
                    else{
                        r = mid-1;
                        mid = (l+r)/2;
                    }
                }
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(search(matrix,3));
    }
}