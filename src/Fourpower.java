import java.util.Scanner;

public class Fourpower {

    public static int isPowerOfFour(int n)
    {
        if(n == 0)
            return 0;
        while(n != 1)
        {
            if(n % 4 != 0)
                return 0;
            n = n / 4;
        }
        return 1;
    }

    public static void main(String[] args) {
        Fourpower fp = new Fourpower();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();
        int res = fp.isPowerOfFour(n);
        if(res ==1 ){
            System.out.println("Number "+n+" is a power of four");
        }
        else{
            System.out.println("Number "+n+" is not a power of four");
        }
    }
}
