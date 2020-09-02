package main;


public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     * <p>
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     * <p>
     * The string may contain non-bracket characters as well.
     * <p>
     * These strings have balanced brackets:
     * "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     * <p>
     * While these do not:
     * "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
        int sumIndexOfOpeningBrackets = 0;
        int sumIndexOfClosingBrackets = 0;
        //count brackets and keep track of "[" vs "]" index
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                brackets++;
                sumIndexOfOpeningBrackets = sumIndexOfOpeningBrackets + str.indexOf(ch);
            } else if (ch == ']') {
                brackets--;
                sumIndexOfClosingBrackets = sumIndexOfClosingBrackets + str.indexOf(ch);
            }
        }
        //ensure brackets exist:
        if (str.contains("[") == false) {
            return false;
        }
        //ensure brackets are nested correctly:
        if (sumIndexOfClosingBrackets < sumIndexOfOpeningBrackets) {
            return false;
        }
        return brackets == 0;
    }

    public static String countBalancedBrackets(String str) {
        int brackets = 0;
        if (BalancedBrackets.hasBalancedBrackets(str) == true) {
            for (char ch : str.toCharArray()) {
                if (ch == '[') {
                    brackets++;
                }
            }
        } return brackets +" brackets detected.";
    }
}


