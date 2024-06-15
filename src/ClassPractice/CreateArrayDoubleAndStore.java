package ClassPractice;

public class CreateArrayDoubleAndStore {

    public static void main(String[] args) {

        int [] arr = {1,2,3};

        int [] doublearr = new int[arr.length];

        for (int i=0;i< arr.length;i++){
doublearr[i]=arr[i]*2;
        }
for (int i=0;i< doublearr.length;i++){
    System.out.print(doublearr[i]+" ");
}
        //System.out.println("Dobled the array and stored "+doublearr);
    }
}
