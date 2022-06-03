package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.print("Result: " + calculate(x,y));

    }
    public static double calculate(int x, int y){
        return Math.pow(x,y);
    }
}
