package ClassPractice;

public class Genric {

    public static void main(String[] args) {
        printF(3,4);
        printF("pramod","dutta");
        printF(true,false);
        printF(3.12,4.34);
    }

    private static <T> void printF(T i, T i1) {
        System.out.print(i+" ");
        System.out.print(i1);
        System.out.println();

    }
}
