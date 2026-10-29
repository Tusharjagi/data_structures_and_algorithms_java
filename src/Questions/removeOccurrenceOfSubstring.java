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

    void main() {
        String s = "ababcab";
        String part = "ab";
        String ans = occOfSubString(s, part);
        System.out.println("Ans: " + ans);
    }
}
