package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;

public class FreebieOfferMap {
    public static Map<Character, FreebieOffer> freebieOfferMap = new HashMap<>();
    static {
        freebieOfferMap.put('E', new FreebieOffer('E', 2, 'B', 1));
        freebieOfferMap.put('N', new FreebieOffer('N', 3, 'M', 1));
        freebieOfferMap.put('R', new FreebieOffer('R', 3, 'Q', 1));

    }
}

