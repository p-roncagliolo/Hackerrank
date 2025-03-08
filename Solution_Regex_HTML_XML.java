import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution_Regex_HTML_XML {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String regex = "(<)(.+)(>)([-\\w!@\\$%^&#\\*()_+|~=`\"\\{\\}\\[\\]:'\\, ]+)(</)(\\2)(>)";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        for (int i = 0; i < n; i++) {
            String content = in.nextLine();
            Matcher matcher = pattern.matcher(content);
            if (matcher.find()) {
                do {
                    System.out.println(matcher.group(4));
                }
                while (matcher.find());
            } else {
                System.out.println("None");
            }
        }

    }
}
