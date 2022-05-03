package befaster.solutions.CHK;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Optional;

import static befaster.solutions.CHK.CheckoutSolution.checkout;
import static org.junit.Assert.*;

public class CheckoutSolutionTest {
    CheckoutSolution checkoutSolution = new CheckoutSolution();

    @Test
    public void testIllegalInputLowerCase() {
        assertEquals(-1, checkoutSolution.checkout("abab").intValue());
        assertEquals(-1, checkoutSolution.checkout("gfhj").intValue());
    }

//    @Test
//    public void testIllegalInputNonExistentItem() {
//        assertEquals(-1, checkoutSolution.checkout("EFGHIJ").intValue());
//        assertEquals(-1, checkoutSolution.checkout("ABEFG").intValue());
//    }

    @Test
    public void testZeroItems() {
        assertEquals(0, checkoutSolution.checkout("").intValue());
    }

    @Test
    public void testNoOfferItems() {
        assertEquals(55, checkoutSolution.checkout("CDC").intValue());
        assertEquals(15, checkoutSolution.checkout("D").intValue());
        assertEquals(20, checkoutSolution.checkout("G").intValue());
        assertEquals(35, checkoutSolution.checkout("I").intValue());
        assertEquals(60, checkoutSolution.checkout("J").intValue());
        assertEquals(90, checkoutSolution.checkout("L").intValue());
        assertEquals(15, checkoutSolution.checkout("M").intValue());
        assertEquals(10, checkoutSolution.checkout("O").intValue());
        assertEquals(30, checkoutSolution.checkout("S").intValue());
        assertEquals(20, checkoutSolution.checkout("T").intValue());
        assertEquals(20, checkoutSolution.checkout("W").intValue());
        assertEquals(90, checkoutSolution.checkout("X").intValue());
        assertEquals(10, checkoutSolution.checkout("Y").intValue());
        assertEquals(50, checkoutSolution.checkout("Z").intValue());

    }

    @Test
    public void testItemsWithOneMultiPriceOffer() {
        assertEquals(65, checkoutSolution.checkout("BCD").intValue());
        assertEquals(110, checkoutSolution.checkout("BCBBD").intValue());

        assertEquals(50, checkoutSolution.checkout("FFFFFFF").intValue());
        assertEquals(40, checkoutSolution.checkout("FFFFFF").intValue());
        assertEquals(40, checkoutSolution.checkout("FFFFF").intValue());
        assertEquals(30, checkoutSolution.checkout("FFFF").intValue());
        assertEquals(20, checkoutSolution.checkout("FFF").intValue());
        assertEquals(20, checkoutSolution.checkout("FF").intValue());
        assertEquals(10, checkoutSolution.checkout("F").intValue());

        assertEquals(380, checkoutSolution.checkout("KKKKK").intValue());
        assertEquals(300, checkoutSolution.checkout("KKKK").intValue());
        assertEquals(230, checkoutSolution.checkout("KKK").intValue());
        assertEquals(150, checkoutSolution.checkout("KK").intValue());
        assertEquals(80, checkoutSolution.checkout("K").intValue());

        assertEquals(250, checkoutSolution.checkout("PPPPPP").intValue());
        assertEquals(200, checkoutSolution.checkout("PPPPP").intValue());
        assertEquals(200, checkoutSolution.checkout("PPPP").intValue());
        assertEquals(150, checkoutSolution.checkout("PPP").intValue());

    }

    @Test
    public void testItemsWithTwoMultiPriceOffers() {
        assertEquals(450, checkoutSolution.checkout("AAAAAAAAAAA").intValue());
        assertEquals(400, checkoutSolution.checkout("AAAAAAAAAA").intValue());
        assertEquals(380, checkoutSolution.checkout("AAAAAAAAA").intValue());
        assertEquals(330, checkoutSolution.checkout("AAAAAAAA").intValue());
        assertEquals(300, checkoutSolution.checkout("AAAAAAA").intValue());
        assertEquals(250, checkoutSolution.checkout("AAAAAA").intValue());
        assertEquals(200, checkoutSolution.checkout("AAAAA").intValue());
        assertEquals(180, checkoutSolution.checkout("AAAA").intValue());
        assertEquals(130, checkoutSolution.checkout("AAA").intValue());
        assertEquals(100, checkoutSolution.checkout("AA").intValue());
        assertEquals(50, checkoutSolution.checkout("A").intValue());

        assertEquals(260, checkoutSolution.checkout("VVVVVV").intValue());
        assertEquals(180, checkoutSolution.checkout("VVVV").intValue());
        assertEquals(130, checkoutSolution.checkout("VVV").intValue());
        assertEquals(90, checkoutSolution.checkout("VV").intValue());
        assertEquals(50, checkoutSolution.checkout("V").intValue());
    }

    @Test
    public void testItemsWithFreebieOffers() {
        assertEquals(200, checkoutSolution.checkout("EEEEEB").intValue());
        assertEquals(200, checkoutSolution.checkout("EEEEE").intValue());
        assertEquals(230, checkoutSolution.checkout("EEEEEBBB").intValue());
        assertEquals(245, checkoutSolution.checkout("EEEEEBBBB").intValue());
        assertEquals(275, checkoutSolution.checkout("EEEEEBBBBB").intValue());
        assertEquals(290, checkoutSolution.checkout("EEEEEBBBBBB").intValue());
        assertEquals(320, checkoutSolution.checkout("EEEEEBBBBBBB").intValue());

        assertEquals(215, checkoutSolution.checkout("NNNNNMM").intValue());
    }

}