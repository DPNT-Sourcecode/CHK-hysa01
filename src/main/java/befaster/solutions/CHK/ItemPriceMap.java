package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;

public class ItemPriceMap {
    public static Map<Character, Integer> itemPriceMap = new HashMap<>();
    static {
        itemPriceMap.put('A', 50);
        itemPriceMap.put('B', 30);
        itemPriceMap.put('C', 20);
        itemPriceMap.put('D', 15);
        itemPriceMap.put('E', 40);
        itemPriceMap.put('F', 10);
    }

}
