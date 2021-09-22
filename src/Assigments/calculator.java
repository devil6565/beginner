package Assigments;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("entre the num1 opretor num2:");
        Scanner n = new Scanner(System.in);
        double d1 = n.nextDouble();
        char op = n.next().charAt(1);
        double d2 = n.nextDouble();
        if (op == '+')
            System.out.println(d1+d2);
        else if (op == '/')
            System.out.println(d1/d2);
        else if(op=='*')
            System.out.println(d1*d2);
    }
}

