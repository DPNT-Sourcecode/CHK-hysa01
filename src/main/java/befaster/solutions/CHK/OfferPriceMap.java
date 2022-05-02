package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;


public class OfferPriceMap {
    public static Map<Character, Offer> offerPriceMap = new HashMap<>();
    static {
        offerPriceMap.put('A', new Offer('A', 3, 130));
        offerPriceMap.put('B', new Offer('B', 2, 45));
    }

}
