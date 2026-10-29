package Questions;

public class reverseString {

    String reverseString (String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length() -1;

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            if (i < 0) {
                break;
            }
            int j =i;
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }
            ans.append(s.substring(j+1, i+1));

            while (j >= 0 && s.charAt(j) == ' ') {
                j--;
            }
            if (j >= 0) {
                ans.append(' ');
            }
            i = j;
        }
        return ans.toString();
    }

    char mostFreqCh (String s) {
        int[] freq = new int[26];
        int maxFreq = -1;
        char ans = s.charAt(0);


        for (int i =0; i<s.length(); i++) {
            char currChar = s.charAt(i);
            freq[currChar - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                ans = (char)(i + 'a');
            }
        }
        return ans;
    }

    void main () {
        String str = "banana";
        char ans = mostFreqCh(str);
        System.out.println("Ans: " + ans);
    }
}
