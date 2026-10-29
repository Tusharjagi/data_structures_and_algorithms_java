
package Questions;

public class AdjacentDuplicates {

    String adjacentDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            int size = sb.length();

            if (size > 0 && sb.charAt(size - 1) == currChar) {
                sb.deleteCharAt(size - 1);
            } else {
                sb.append(currChar);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        AdjacentDuplicates obj = new AdjacentDuplicates();

        String s = "abbaca";
        String ans = obj.adjacentDuplicates(s);

        System.out.println("Ans: " + ans);
    }
}
