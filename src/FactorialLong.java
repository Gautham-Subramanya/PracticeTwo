public class FactorialLong {

    public static void main(String[] args) {
        System.out.println("Long factorials:");
        LongFactorials();
    }

    private static void LongFactorials()
    {
        long i  = 1;
        long fact = 1;
        while (true)
        {
            System.out.printf("The factorial of %d is is %d\n", i, fact);
            if (Long.MAX_VALUE / fact < (i+1)) {
                System.out.printf("The factorial of %d is out of range.\n", (i+1));
                break;
            }
            i++;
            fact *= i;
        }

    }
}