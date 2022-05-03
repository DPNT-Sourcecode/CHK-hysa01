package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;


public class MultiPriceOfferMap {
    public static Map<Character, MultiPriceOffer> offerPriceMap = new HashMap<>();
    static {
        offerPriceMap.put('A', new MultiPriceOffer('A', 3, 130));
        offerPriceMap.put('B', new MultiPriceOffer('B', 2, 45));
    }

}