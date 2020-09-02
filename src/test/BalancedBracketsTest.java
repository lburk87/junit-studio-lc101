package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void noBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("no brackets"));
    }

    @Test
    public void balancedBracketsAndWordsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[non-bracket characters]okay with[brackets]"));
    }

    @Test
    public void notBalancedBracketsAndWordsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[three opening brackets]] only 2 closing brackets"));
    }

    @Test
    public void bracketsArePairedCorrectly() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][["));
    }

    @Test
    public void bracketsInOrder() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void bracketsInOrder2() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][[]]]]]]]]"));
    }

    @Test
    public void curlyBracketsDoNotCount() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{}"));
    }

    @Test
    public void comparisonsDoNotCount() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("<<>>"));
    }

    @Test
    public void countBalancedBracketsCountsCorrectly() {
        assertEquals(BalancedBrackets.countBalancedBrackets("[[[]]]"), "3 brackets detected.");
    }

    @Test
    public void countBalancedBracketsIfNoBalancedBrackets() {
        assertEquals(BalancedBrackets.countBalancedBrackets(""), "0 brackets detected.");
    }

    @Test
    public void tbd() {

    }
}





