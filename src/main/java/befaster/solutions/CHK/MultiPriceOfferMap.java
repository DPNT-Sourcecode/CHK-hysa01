package befaster.solutions.CHK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class MultiPriceOfferMap {
    public static Map<Character, ArrayList> multiPriceOfferMap = new HashMap<>();
    static {
        ArrayList<MultiPriceOffer> multiPriceOfferlistA = new ArrayList<>();
        ArrayList<MultiPriceOffer> multiPriceOfferlistB = new ArrayList<>();
        ArrayList<MultiPriceOffer> multiPriceOfferlistF = new ArrayList<>();


        multiPriceOfferlistA.add(new MultiPriceOffer('A', 5, 200));
        multiPriceOfferlistA.add(new MultiPriceOffer('A', 3, 130));

        multiPriceOfferlistB.add(new MultiPriceOffer('B', 2, 45));

        multiPriceOfferlistF.add(new MultiPriceOffer('F', 3, 20));


        multiPriceOfferMap.put('A', multiPriceOfferlistA);
        multiPriceOfferMap.put('B', multiPriceOfferlistB);
        multiPriceOfferMap.put('F', multiPriceOfferlistF);


    }

}
