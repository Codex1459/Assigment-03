/* Create a program to take a number as input find the frequency of each digit in the number 
using an array and display the frequency of each digit  */
import java.util.Scanner;
public class DigitFrequency_level_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int[] freq = new int[10];
        while (num != 0) {
            int digit = num % 10;
            freq[digit]++;
            num /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }
    }
}