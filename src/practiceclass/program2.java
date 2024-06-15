package practiceclass;

public class program2 {
    public static void main(String[] args) {


        int[] num = {2, 7, 11, 15};
        int n = num.length;
        int target = 9;

        for (int i=0;i<n;i++){
            for (int j=1;j<n;j++){
                if((num[i]+num[j])==target){
                    System.out.println(num[i]+" "+num[j]);
                }
            }
        }
    }
}