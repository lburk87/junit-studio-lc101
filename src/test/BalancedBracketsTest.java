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
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("words"));
    }

    @Test
    public void balancedBracketsAndWordsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[words]and bracket[ and bracket ]"));
    }

    @Test
    public void notBalancedBracketsAndWordsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[words[ whoa [ gotta close these brackets]] whoops"));
    }

    @Test
    public void bracketsArePairedCorrectly() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][[["));
    }


}
