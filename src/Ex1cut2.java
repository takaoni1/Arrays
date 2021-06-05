import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex1cut2 {
    public static int[] readArray() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("arrayA -> Introduceti numarul de numere:");
        n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();

        }

        return array;
    }

//    public static void findDiff (int[] arrayA, int[] arrayB) {
//        List<Integer> arrayC = new ArrayList<>();
//
//        for (int i = 0; i < arrayA.length; i++) {
//            boolean flag = false;
//            for (int j = 0; j < arrayB.length; j++) {
//                if (arrayA[i] == arrayB[j]) {
//                    flag = true;
//                    break;
//                }
//            }
//
//            if (!flag) {
//                arrayC.add(arrayA[i]);
//            }
//        }
//
//        System.out.println(arrayC);
//    }
//
//    public static void printArray(int[] array, int nrE) {
//        for (int i = 0; i < nrE; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//    }

    public static int[] findDiff2 (int[] arrayA, int[] arrayB) {
        int[] arrayC = new int[arrayA.length];
        int k = 0;
        int aux, count;

        for (int i = 0; i < arrayA.length; i++) {
            count = 0;
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i] == arrayB[j]) {
                    break;
                } else {
                    count++;
                }
            }

            if (count == arrayB.length) {
                aux = arrayA[i];
                arrayC[k] = aux;
                k++;
                if (k == arrayC.length) {
                    arrayC = Arrays.copyOf(arrayC, arrayC.length * 2);
                }
            }
        }

        return Arrays.copyOf(arrayC, k);
    }

    public static int[] arrayReun(int[] arrayA, int[] arrayB) {
        int[] arrayC = findDiff2(arrayA, arrayB);
        int k = arrayC.length + arrayB.length;
        int[] arrayD = Arrays.copyOf(arrayB, k);
        int aux;
        int count = 0;

        for (int j = arrayB.length; j < k; j++) {
            aux = arrayC[count];
            arrayD[j] = aux;
            count++;
        }

        return Arrays.copyOf(arrayD, k);
    }

    public static int[] arrayInter(int[] arrayA, int[] arrayB) {
        int[] myArray = new int[arrayA.length];
        int count = 0;
        int aux;

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i] == arrayB[j]) {
                    aux = arrayA[i];
                    myArray[count] = aux;
                    count++;
                    if (count == myArray.length) {
                        myArray = Arrays.copyOf(myArray, myArray.length * 2);
                    }
                }
            }
        }

        return Arrays.copyOf(myArray, count);
    }
}