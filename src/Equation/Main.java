package Equation;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String equ;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите уравнение: ");
        equ = in.nextLine();
        if (equ.startsWith("x") == true) {

            int b = Integer.parseInt(equ.substring(2,3));
            int c = Integer.parseInt(equ.substring(4));

            if (equ.contains("+") == true) {
                System.out.print(c-b);
            }
            if (equ.contains("-") == true) {
                System.out.print(c+b);
            }
        }
         else if (equ.endsWith("x") == true) {

            int a = Integer.parseInt(equ.substring(0,1));
            int b = Integer.parseInt(equ.substring(2,3));

            if (equ.contains("+") == true) {
                System.out.print(a+b);
            }
            if (equ.contains("-") == true) {
                System.out.print(a-b);
            }
        }
        else {

            int a = Integer.parseInt(equ.substring(0,1));
            int c = Integer.parseInt(equ.substring(4));

            if (equ.contains("+")) {
                System.out.print(c-a);
            }
            if (equ.contains("-")) {
                System.out.print(a-c);
            }
        }
    }
}

