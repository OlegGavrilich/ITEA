package week1;

import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = sc.nextInt();
        if((number % 7) == 0){
            System.out.println(pow(number,2));

        }else
            System.out.println("ERROR");
    }
}
