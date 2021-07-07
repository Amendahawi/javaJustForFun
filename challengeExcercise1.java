/*Excercise #1
*The program should allow you to input numbers in the console and calculate the sum of the digits.
*EXAMPLE: User inputs the digits "12345", the output is "Sum = 15".
*/

import java.util.*;
public class challengeExcercise1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers you want to add (No spaces): ");
        int inputedNumbers = sc.nextInt();
        sc.close();
        int total = 0;
        int subtractedNumbers = inputedNumbers;
        calculation(inputedNumbers, total, subtractedNumbers);
    }
        public static void calculation(int inputedNumbers, int total, int subtractedNumbers){
            for (int i = 0; i < Integer.toString(inputedNumbers).length(); i++){
                total += subtractedNumbers%10;
                subtractedNumbers = subtractedNumbers/10;
            }
            System.out.println("Sum = " + total);
        }
    
}
