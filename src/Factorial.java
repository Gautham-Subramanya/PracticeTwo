public class Factorial {
    public static void main(String[] args)
    {
        System.out.println("Integer factorials:");
        IntFactorials();
    }

    private static void IntFactorials()
    {
        int i  = 1;
        int fact = 1;
        while (true)
        {
            System.out.printf("The factorial of %d is %d\n", i, fact);
            if (Integer.MAX_VALUE / fact < (i+1)) {
                System.out.printf("The factorial of %d is out of range.\n", (i+1));
                break;
            }
            i++;
            fact *= i;
        }

    }
}
