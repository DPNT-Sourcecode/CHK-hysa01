package befaster.solutions.CHK;

//import com.sun.xml.internal.ws.api.pipe.ServerTubeAssemblerContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroupDiscountOfferMap {
    public static Map<Character, GroupDiscountOffer> groupDiscountOfferMap = new HashMap<>();
    static {
        ArrayList<Character> discountGroupSTXYZ = new ArrayList<>();

        discountGroupSTXYZ.add('S');
        discountGroupSTXYZ.add('T');
        discountGroupSTXYZ.add('X');
        discountGroupSTXYZ.add('Y');
        discountGroupSTXYZ.add('Z');

        groupDiscountOfferMap.put('S', new GroupDiscountOffer('S',3, 45, discountGroupSTXYZ));
        groupDiscountOfferMap.put('T', new GroupDiscountOffer('T',3, 45, discountGroupSTXYZ));
        groupDiscountOfferMap.put('X', new GroupDiscountOffer('X',3, 45, discountGroupSTXYZ));
        groupDiscountOfferMap.put('Y', new GroupDiscountOffer('Y',3, 45, discountGroupSTXYZ));
        groupDiscountOfferMap.put('Z', new GroupDiscountOffer('Z',3, 45, discountGroupSTXYZ));

    }
}

