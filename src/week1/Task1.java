package week1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();

        if(hour>9 && hour<18){
            System.out.println("I am at work");
        }   else {
            System.out.println("I rest");
        }

        sc.close();
    }
}

