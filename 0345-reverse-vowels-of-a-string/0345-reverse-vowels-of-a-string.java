import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        Pattern p = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
        
        while (i < j) {
            while (i < j && !p.matcher(c[i] + "").find()) {
                i++;
            }
            while (i < j && !p.matcher(c[j] + "").find()) {
                j--;
            }
            if (i < j) {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }
        }
        return new String(c);
    }
}