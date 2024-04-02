import java.util.StringTokenizer;

public class tokens {
    public static void main(String[] args) {
        String input = " ITI develops people and ITI house of developers and ITI for people in java  ";
        String delimiter = "ITI";

     
        StringTokenizer tokenizer = new StringTokenizer(input, delimiter);

        
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken().trim());
        }
    }
}
