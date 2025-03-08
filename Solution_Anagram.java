import java.util.*;

public class Solution_Anagram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.next();
        String B = in.next();
        System.out.println(isAnagram(A,B) ? "Anagrams" : "Not Anagrams");
    }

    private static boolean isAnagram(String a, String b){
        if (a.length() == b.length()) {
            Map<String, Integer> charsFrequencyA = charsFrequency(a.toLowerCase());
            Map<String, Integer> charsFrequencyB = charsFrequency(b.toLowerCase());
            boolean isAnagram = true;
            for (Map.Entry<String, Integer> entry : charsFrequencyA.entrySet()) {
                isAnagram = isAnagram && (Objects.equals(charsFrequencyB.get(entry.getKey()), entry.getValue()));
            }
            return isAnagram;
        } else {
            return false;
        }
    }

    private static Map<String, Integer> charsFrequency(String s) {
        Map<String, Integer> frequency = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!frequency.containsKey(String.valueOf(c))) {
                frequency.put(String.valueOf(c), 1);
            } else {
                frequency.put(String.valueOf(c), frequency.get(String.valueOf(c)) + 1);
            }
        }
        return frequency;
    }

}
