package countandsay;

/**
 The count-and-say sequence is the sequence of integers with the first five terms as following:

 1.     1
 2.     11
 3.     21
 4.     1211
 5.     111221

 1 is read off as "one 1" or 11.
 11 is read off as "two 1s" or 21.
 21 is read off as "one 2, then one 1" or 1211.

 Given an integer n, generate the nth term of the count-and-say sequence.

 Note: Each term of the sequence of integers will be represented as a string.

 Example 1:

 Input: 1
 Output: "1"

 Example 2:

 Input: 4
 Output: "1211"
 */
public class CountAndSay {

    public static final String ONE = "1";

    public String countAndSay(int n) {
        String sequence = ONE;

        if (n < 1) {
            return "";
        }

        if (n == 1) {
            return ONE;
        }

        for (int i = 1; i < n; i++) {
            sequence = evolve(sequence);
        }

        return sequence;
    }

    private String evolve(String sequence) {
        char[] characters = sequence.toCharArray();
        Character currentGroupCharacter = characters[0];
        int currentGroupCount = 1;

        StringBuilder seq = new StringBuilder();

        for (int i = 1; i < characters.length; i++) {
            if (characters[i] == currentGroupCharacter) {
                currentGroupCount++;
            } else {
                seq.append(currentGroupCount);
                seq.append(currentGroupCharacter);
                currentGroupCharacter = characters[i];
                currentGroupCount = 1;
            }
        }

        seq.append(currentGroupCount);
        seq.append(currentGroupCharacter);

        return seq.toString();
    }

}
