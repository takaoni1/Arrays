//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//public class Ex1 {
//    public static void main(String[] args) {
//        int n, m;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("arrayA -> Introduceti numarul de numere:");
//        n = sc.nextInt();
//        int[] arrayA = new int[n];
//        System.out.println("Enter all the elements:");
//        for (int i = 0; i < n; i++) {
//            arrayA[i] = sc.nextInt();
//        }
//
//        System.out.print("arrayB -> Introduceti numarul de numere:");
//        m = sc.nextInt();
//        int[] arrayB = new int[m];
//        System.out.println("Enter all the elements:");
//        for (int i = 0; i < m; i++) {
//            arrayB[i] = sc.nextInt();
//        }
//
//        List<Integer> arrayC = new ArrayList<>();
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
//}