import java.io.File;
import java.util.Scanner;

public class WordFrequency {

    public static void main(String[] args) throws Exception {

        File file = new File("/home/user/sample.txt");
        Scanner sc = new Scanner(file);
        String temp = new String("");
        while (sc.hasNextLine()) {
            temp = sc.nextLine();
        }
        countWords(temp);
    }

    static void countWords(String st) {
        //split text to array of words
        String[] words = st.split("\\s");
        //frequency array
        int[] fr = new int[words.length];
        //init frequency array
        for (int i = 0; i < fr.length; i++)
            fr[i] = 0;
        //count words frequency
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    fr[i]++;
                }
            }
        }
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    if (i != j) {
                        words[i] = "";
                        fr[i] = 0;
                    }

                }
            }
        }
        System.out.println("The frequency of words is");
        for (int i = 0; i < words.length; i++) {
            if (fr[i] == 0) {
                System.out.println("");
            } else {
                System.out.println(words[i] + " " + fr[i]);
            }
        }
    }
}