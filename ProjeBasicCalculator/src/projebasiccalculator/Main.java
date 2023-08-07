/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projebasiccalculator;

import java.util.Scanner;

/**
 *
 * @author Emin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter A");
        double A = sc.nextDouble();
        System.out.println("enter B");
        double B = sc.nextDouble();
        System.out.println("enter operator");
        char oper = sc.next().charAt(0);

        double result = 0;
        if (oper == '+') {
            result = A + B;
        } else if (oper == '-') {
            result = A - B;
        } else if (oper == '*') {
            result = A * B;
        } else if (oper == '/') {
            result = A / B;
        } else {
            System.out.println("please enter correct operator");
        }
        if (result % 1 == 0) {
            System.out.println((int) result);
        } else {

            System.out.println(result);
        }
    }
}
