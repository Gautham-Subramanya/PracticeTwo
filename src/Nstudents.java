import java.util.Scanner;

public class Nstudents {
    public static void main(String[] args) {
        System.out.println("Enter the number of students: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] grades = new int[n];
        int j;
        double sum = 0.0, average;
        for(j=0;j<n;j++){
            System.out.println("Enter the grade for student "+j);
            grades[j] = scan.nextInt();
        }
        for( j=0;j<n;j++) {
            sum = sum + grades[j];
        }
        average = sum/n;
        int min = grades[0];
        int max = grades[0];
        for(j=0;j<n;j++){
            if(min>grades[j]){
                min = grades[j];
            }
        }
        for(j=0;j<n;j++){
            if(max<grades[j]){
                max = grades[j];
            }
        }
        System.out.println("The average is "+ average);
        System.out.println("The minimum is "+ min);
        System.out.println("The maximum is "+ max);
    }
}
