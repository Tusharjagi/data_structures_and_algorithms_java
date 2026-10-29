package Questions;

public class removeOccurrenceOfSubstring {

    String occOfSubString(String s, String part) {
        while (s.contains(part)) {
            int index = s.indexOf(part);

            s = s.substring(0, index)
                    + s.substring(index + part.length());
        }

        return s;
    }

    boolean compareFreq(int[] count1, int[] count2) {
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }

    boolean permutationString (String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count1 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int index = ch - 'a';
            count1[index]++;
        }
        int i =0;
        int windowLength = s1.length();
        int[] count2 = new int[26];
        for (i = 0; i < windowLength; i++) {
            char ch = s2.charAt(i);
            int index = ch - 'a';
            count2[index]++;
        }

        if (compareFreq(count1, count2) == true) {
            return true;
        } else {
            while (i < s2.length()) {
                char newChar = s2.charAt(i);
                int newCharIndex = newChar - 'a';
                count2[newCharIndex]++;

                int oldCharIndex = i - windowLength;
                char oldChar = s2.charAt(oldCharIndex);
                int freqTableIndexOfOldChar = oldChar - 'a';
                count2[freqTableIndexOfOldChar]--;
                if (compareFreq(count1, count2) == true) {
                    return true;
                }
                i++;
            }
        }
        return false;

    }

    void main() {
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean ans = permutationString(s1, s2);
        System.out.println("Ans: " + ans);
    }
}
