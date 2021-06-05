import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayA = Ex1cut2.readArray();
        int[] arrayB = Ex1cut2.readArray();


        int[] arrayC = Ex1cut2.findDiff2(arrayA,arrayB);
        Ex1cut2.printArray(arrayC, arrayC.length);
//        System.out.println(Arrays.toString(Ex1cut2.findDiff2(arrayA, arrayB)));
        System.out.println();
        int[] arrayD = Ex1cut2.arrayReun(arrayA,arrayB);
        Ex1cut2.printArray(arrayD, arrayD.length);
//        System.out.println(Arrays.toString(Ex1cut2.arrayReun(arrayA,arrayB)));
        System.out.println();
//        System.out.println(Arrays.toString(Ex1cut2.arrayInter(arrayA,arrayB)));
        int[] arrayE = Ex1cut2.arrayInter(arrayA,arrayB);
        Ex1cut2.printArray(arrayE, arrayE.length);
    }
}
