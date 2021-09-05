/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Billy Duartez
 */

/*
Program prompts for two numbers. Prints the sum, difference, product, and quotient of those numbers.
*/
// importing libraries
import java.util.Scanner;
import java.lang.String;

public class Solution05 {
    public static void main(String[] args) {

        //name scanner to read inputs by user
        Scanner scan = new Scanner(System.in);

        //prompt message to ask user for first and second number
        System.out.println("What is the first number?");
        String num1 = scan.next();
        System.out.println("What is the second number?");
        String num2 = scan.next();

        //converting string to integers
        int convNum1=Integer.parseInt(num1);
        int convNum2=Integer.parseInt(num2);

        //sum
        int sum = convNum1 + convNum2;
        System.out.println(convNum1+" + "+convNum2+" = "+sum);

        //difference
        int diff = convNum1 - convNum2;
        System.out.println(convNum1+" - "+convNum2+" = "+diff);

        //multiplication
        int mult = convNum1 * convNum2;
        System.out.println(convNum1+" * "+convNum2+" = "+mult);

        //quotient
        int quot = convNum1 / convNum2;
        System.out.println(convNum1+" / "+convNum2+" = "+quot);
    }
}
