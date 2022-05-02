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
    void testIllegalInputLowerCase() {
        assertEquals(-1, checkoutSolution.checkout("abab"), 0.0);
        assertEquals(-1, checkoutSolution.checkout("gfhj"), 0.0);


    }

}

