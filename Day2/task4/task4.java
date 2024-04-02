import java.util.regex.Matcher;
import java.util.regex.Pattern;

class task4 {
    public static void main(String args[]) {
        String complete_ip = "";
        String str = "127.2.6.34";
        String regex_pattern = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        Pattern pattern = Pattern.compile(regex_pattern + "\\." + regex_pattern + "\\." + regex_pattern + "\\." + regex_pattern);
        Matcher matcher = pattern.matcher(str.trim());
        if (matcher.matches()) {
            complete_ip = String.join(".", str.trim().split("\\."));
            System.out.println("This is a Valid IP "+complete_ip);
        } else {
            System.out.println("Enter a Valid IP");
        }
        
    }
}
