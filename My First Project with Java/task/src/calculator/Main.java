package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Earned amount:\n" +
                "Bubblegum: $202\n" +
                "Toffee: $118\n" +
                "Ice cream: $2250\n" +
                "Milk chocolate: $1680\n" +
                "Doughnut: $1075\n" +
                "Pancake: $80");

        int income = 202+118+2250+1680+1075+80;
        System.out.println("Income: $" + income);
        System.out.println("Staff expenses:");
        int staff = sc.nextInt();
        System.out.println("Other expenses:");
        int other = sc.nextInt();
        System.out.println("Net income: $" + ((income - staff) - other));
    }
}
