import java.util.Scanner;

public class Palindrome {
    public int reverseNumber(int number){
        int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number to be reversed and checked for palindrome");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        Palindrome p = new Palindrome();
        int res = p.reverseNumber(input);
        if(res == input){
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }
    }
}

