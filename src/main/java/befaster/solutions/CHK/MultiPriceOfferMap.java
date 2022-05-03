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
        ArrayList<MultiPriceOffer> multiPriceOfferlistH = new ArrayList<>();
        ArrayList<MultiPriceOffer> multiPriceOfferlistK = new ArrayList<>();
        ArrayList<MultiPriceOffer> multiPriceOfferlistP = new ArrayList<>();
        ArrayList<MultiPriceOffer> multiPriceOfferlistQ = new ArrayList<>();
        ArrayList<MultiPriceOffer> multiPriceOfferlistU = new ArrayList<>();
        ArrayList<MultiPriceOffer> multiPriceOfferlistV = new ArrayList<>();



        multiPriceOfferlistA.add(new MultiPriceOffer('A', 5, 200));
        multiPriceOfferlistA.add(new MultiPriceOffer('A', 3, 130));

        multiPriceOfferlistB.add(new MultiPriceOffer('B', 2, 45));

        multiPriceOfferlistF.add(new MultiPriceOffer('F', 3, 20));

        multiPriceOfferlistH.add(new MultiPriceOffer('H', 10, 80));
        multiPriceOfferlistH.add(new MultiPriceOffer('H', 5, 45));

        multiPriceOfferlistK.add(new MultiPriceOffer('K', 2, 120));

        multiPriceOfferlistP.add(new MultiPriceOffer('P', 5, 200));

        multiPriceOfferlistQ.add(new MultiPriceOffer('Q', 3, 80));

        multiPriceOfferlistU.add(new MultiPriceOffer('U', 4, 120));

        multiPriceOfferlistV.add(new MultiPriceOffer('V', 3, 130));
        multiPriceOfferlistV.add(new MultiPriceOffer('V', 2, 90));



        multiPriceOfferMap.put('A', multiPriceOfferlistA);
        multiPriceOfferMap.put('B', multiPriceOfferlistB);
        multiPriceOfferMap.put('F', multiPriceOfferlistF);
        multiPriceOfferMap.put('H', multiPriceOfferlistH);
        multiPriceOfferMap.put('K', multiPriceOfferlistK);
        multiPriceOfferMap.put('P', multiPriceOfferlistP);
        multiPriceOfferMap.put('Q', multiPriceOfferlistQ);
        multiPriceOfferMap.put('U', multiPriceOfferlistU);
        multiPriceOfferMap.put('V', multiPriceOfferlistV);



    }

}

