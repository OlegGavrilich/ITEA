package week1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        System.out.println("Enter your Array: ");
        Scanner sc = new Scanner(System.in);
        int[] n1 = new int[3];
        for (int i = 0; i < n1.length; i++) {
            n1[i] = sc.nextInt();
        }
        boubleSort(n1);
        //System.out.println(Arrays.toString(n1));
        System.out.println("Smallest number is: " + n1[0]);
        System.out.println("Bigest number is: " + n1[n1.length-1]);


    }

    public static void boubleSort(int[] n1){
        for (int i = 0; i < n1.length; i++) {
            for (int j = 1; j < n1.length; j++) {
                if(n1[j]<n1[j-1]){
                    int box;
                    box = n1[j];
                    n1[j] = n1[j-1];
                    n1[j-1] = box;
                }

            }
        }
    }
}
