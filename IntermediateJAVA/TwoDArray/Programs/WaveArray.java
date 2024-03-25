package IntermediateJAVA.TwoDArray.Programs;

public class WaveArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        printWaveArrayChadApproach(arr);
    }

    public static void printWaveArraySyedApproach(int[][] arr) {

        //Logic
        int j = 0; //Pointer for row
        for(int i = 0; i < arr[0].length; i++){ //Columns Loop
            while(j < arr.length && j >= 0){
                System.out.print(arr[j][i] + " ");
                j = (i % 2 == 0) ? j + 1 : j - 1;
            }
            j = (i % 2 == 0) ? arr.length-1 : 0;
        }
    }

    public static void printWaveArrayChadApproach(int[][] arr) {

        //Logic
        for(int i = 0; i < arr[0].length; i++){ //Columns Loop
            if(i % 2 == 0){
                for(int j = 0; j < arr.length; j++){
                    System.out.print(arr[j][i] + " ");
                }
            }
            else{
                for(int j = arr.length-1; j >= 0; j--){
                    System.out.print(arr[j][i] + " ");
                }
            }
        }
    }
}
