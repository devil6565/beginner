package Assigments;

import java.util.Scanner;

public class ifelseexercise{
    public static void main(String[] args){
        System.out.print("Entre the four digit number:");

        Scanner i=new Scanner(System.in);
        int n=i.nextInt();
        if (n<999 || n>10000)
            System.out.println("invalid number");
        else {
            int lastdigit = n % 10;//D
            int thirddigit = (n / 10) % 10;
            int seconddigit = (n / 100) % 10;
            int firstdigit = (n / 1000);

            if (firstdigit + seconddigit == thirddigit + lastdigit)
                System.out.println("lucy!!");
            else
                System.out.println("not lucy!!");
        }

    }
}
