package test;

//import main.BalancedBrackets;
import main.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void stringIncludingOtherCharactersInsideTheBracketsShouldReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void stringIncludingOtherCharactersAtTheBeginningShouldReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void stringIncludingOtherCharactersAtTheEndShouldReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }

    @Test
    public void stringIncludingOtherCharactersInTheMiddleShouldReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[]Code"));
    }

    @Test
    public void emptyStringShouldReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void stringWithoutBracketsReturnsTrue(){ assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }


    @Test
    public void onlyReversedBracketsReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void unbalancedNumberOfBracketsReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch]]Code]"));
    }

    @Test
    public void onlyOpenBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyCloseBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void BracketsWithinBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
}
