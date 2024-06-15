package ClassPractice;

public class MaxNumberFromArray {
    public static void main(String[] args) {
        int [] arr={10,87,96,56,78};
        int max =0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
