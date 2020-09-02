package main;


public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
        int bracket1 = 0;
        int bracket2 = 0;
        //count brackets and keep track of "[" vs "]" index
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                brackets++;
                bracket1 = bracket1 + str.indexOf(ch);
            } else if (ch == ']') {
                brackets--;
                bracket2 = bracket2 + str.indexOf(ch);
            }
        }
        //ensure brackets are in order:
        if (str.contains("[") == false) {
            return false;
        }
        if (bracket2 < bracket1) {
            return false;
        }
        //return:
        return brackets == 0;
    }
}
