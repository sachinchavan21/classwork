package ClassPractice;

public class TransverseOfArray {


    public static void main(String[] args) {
        int [][] arr = {

                {1,4,7} ,

                {2,5,8} ,

                {3,6,9}
        };

      int [][] tran = new int [3][3];


        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr.length;j++){

               tran[i][j] = arr[j][i];

            }
        }
        System.out.println("Printing original array");
        System.out.println("-----------------------");

        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr.length;j++) {
                System.out.print(arr[i][j]);

            }
            System.out.println();
            }


        System.out.println("Printing Transverse array");
        System.out.println("-----------------------");


        for (int i=0;i<tran.length;i++){
            for (int j=0;j< tran.length;j++) {
                System.out.print(tran[i][j]);

            }
            System.out.println();
        }
    }
}
