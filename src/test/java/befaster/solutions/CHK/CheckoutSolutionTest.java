package befaster.solutions.CHK;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Optional;

import static befaster.solutions.CHK.CheckoutSolution.checkout;
import static org.junit.Assert.*;

public class CheckoutSolutionTest {
    CheckoutSolution checkoutSolution;

    @BeforeEach
    void setUp() {
        checkoutSolution = new CheckoutSolution();
    }

    @Test
    public void testIllegalInputLowerCase() {
        assertEquals(-1, checkoutSolution.checkout("abab").intValue());
        assertEquals(-1, checkoutSolution.checkout("gfhj").intValue());
    }

    @Test
    public void testIllegalInputNonExistentItem() {
        assertEquals(-1, checkoutSolution.checkout("EFGHIJ").intValue());
        assertEquals(-1, checkoutSolution.checkout("ABEFG").intValue());
    }

    @Test
    public void testZeroItems() {
        assertEquals(0, checkoutSolution.checkout("").intValue());
    }

    @Test
    public void testNoOfferItems() {
        assertEquals(55, checkoutSolution.checkout("CDC").intValue());
        assertEquals(15, checkoutSolution.checkout("D").intValue());
    }

    @Test
    public void testOneOfferItem() {
        assertEquals(85, checkoutSolution.checkout("ACD").intValue());
        assertEquals(150, checkoutSolution.checkout("ACAA").intValue());
        assertEquals(200, checkoutSolution.checkout("ACAAA").intValue());
    }

    @Test
    public void testTwoOfferItems() {
        assertEquals(80, checkoutSolution.checkout("AB").intValue());
        assertEquals(145, checkoutSolution.checkout("ABAB").intValue());
        assertEquals(175, checkoutSolution.checkout("AAABB").intValue());
        assertEquals(290, checkoutSolution.checkout("ABBBACDAA").intValue());

    }

}