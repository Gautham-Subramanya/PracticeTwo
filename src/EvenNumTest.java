import java.util.Scanner;

public class EvenNumTest {
    public static boolean isEven(int number){
        if(number%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        EvenNumTest ent = new EvenNumTest();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();
        boolean res = ent.isEven(n);
        System.out.println(res);
    }
}
