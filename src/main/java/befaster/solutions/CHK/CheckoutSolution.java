package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;

import static befaster.solutions.CHK.ItemPriceMap.itemPriceMap;
import static befaster.solutions.CHK.FreebieOfferMap.freebieOfferMap;
import static befaster.solutions.CHK.MultiPriceOfferMap.multiPriceOfferMap;


public class CheckoutSolution {
    public static Integer checkout(String skus) {
        Map<Character, Integer> checkoutItems = new HashMap<>();
        Integer total = 0;

        if (skusIsInvalid(skus)) {
            return -1;
        } else if (skus.equals("")){
            return 0;
        }
        else {
            for (int i = 0; i < skus.length(); i++) {
                char c = skus.charAt(i);
                checkoutItems.put(c, checkoutItems.getOrDefault(c, 0) + 1);
            }

            for (Character freebieOfferItem : freebieOfferMap.keySet()) {
                Character freebieItem = freebieOfferMap.get(freebieOfferItem).getFreebieItem();
                if (checkoutItems.containsKey(freebieOfferItem) && checkoutItems.containsKey(freebieItem)) {
                    reduceQuantityForFreebieItem(freebieOfferItem, checkoutItems);
                }
            }

            for (Map.Entry<Character, Integer> entry : checkoutItems.entrySet()) {
                Character item = entry.getKey();
                Integer quantity = entry.getValue();
                Integer price = itemPriceMap.get(item);

                if (multiPriceOfferMap.containsKey(item)) {
                    Integer multiPriceTotal = calculatePriceWithMultiPriceOffers(item, quantity, price);
                    total += multiPriceTotal;
                } else {
                    total += price * quantity;
                }
//                    Integer offerQuantity = multiPriceOfferMap.get(item).quantity;
//                    Integer offerPrice = multiPriceOfferMap.get(item).price;
//                    if (offerQuantity < quantity) {
//                        total += (quantity / offerQuantity) * offerPrice + (quantity % offerQuantity) * price;
//                    }
//                    else if (offerQuantity.equals(quantity)) {
//                        total += offerPrice;
//                    }
//                    else {
//                        total += quantity * price;
//                    }
//                } else {
//                    total += quantity * price;
//                }
            }
        }
        return total;
    }

    private static boolean skusIsInvalid(String skus) {
        char[] items = skus.toCharArray();
        for (char item : items) {
            if (!itemPriceMap.containsKey(item) || item == ' ') {
                return true;
            }
        }
        return false;
    }

    private static void reduceQuantityForFreebieItem(Character freebieOfferItem, Map<Character, Integer> checkoutItems) {
        Integer freebieItemQuantityToReduceBy = freebieOfferMap.get(freebieOfferItem).getFreebieItemQuantity();
        Integer freebieOfferItemRequiredQuantity = freebieOfferMap.get(freebieOfferItem).getQuantity();
        Integer freebieOfferItemCurrentQuantity = checkoutItems.get(freebieOfferItem);
        Character freebieItem = freebieOfferMap.get(freebieOfferItem).getFreebieItem();

        if (freebieOfferItemCurrentQuantity >= freebieOfferItemRequiredQuantity) {
            Integer totalReducedQuantity = freebieOfferItemCurrentQuantity / freebieOfferItemRequiredQuantity
                    * freebieItemQuantityToReduceBy;
            if (checkoutItems.get(freebieItem) < totalReducedQuantity
                    || checkoutItems.get(freebieItem).equals(totalReducedQuantity)) {
                checkoutItems.put(freebieItem, 0);
            } else {
                checkoutItems.put(freebieItem, checkoutItems.get(freebieItem) - totalReducedQuantity);
            }
        }
    }

    private static Integer calculatePriceWithMultiPriceOffers(Character item, Integer quantity, Integer price) {
        Integer totalPrice = 0;
        Integer biggestOfferQuantity = ((MultiPriceOffer) multiPriceOfferMap.get(item).get(0)).getQuantity();
        Integer biggestOfferPrice = ((MultiPriceOffer) multiPriceOfferMap.get(item).get(0)).getPrice();

        if (multiPriceOfferMap.get(item).size() > 1) {
            Integer nextBiggestOfferQuantity = ((MultiPriceOffer) multiPriceOfferMap.get(item).get(1)).getQuantity();
            Integer nextBiggestOfferPrice = ((MultiPriceOffer) multiPriceOfferMap.get(item).get(1)).getPrice();

            if (quantity > biggestOfferQuantity) {
                totalPrice += quantity / biggestOfferQuantity * biggestOfferPrice;
                if (quantity % biggestOfferQuantity > nextBiggestOfferQuantity) {
                    totalPrice += quantity % biggestOfferQuantity / nextBiggestOfferQuantity * nextBiggestOfferPrice
                            + quantity % biggestOfferQuantity % nextBiggestOfferQuantity * price;
                } else if (quantity % biggestOfferQuantity == nextBiggestOfferQuantity) {
                    totalPrice += nextBiggestOfferPrice;
                } else {
                    totalPrice += quantity % biggestOfferQuantity * price;
                }
            } else if (quantity.equals(biggestOfferQuantity)) {
                totalPrice += biggestOfferPrice;
            } else if (quantity < biggestOfferQuantity) {
                if (quantity > nextBiggestOfferQuantity) {
                    totalPrice += quantity / nextBiggestOfferQuantity * nextBiggestOfferPrice
                            + quantity % nextBiggestOfferQuantity * price;
                } else if (quantity.equals(nextBiggestOfferQuantity)) {
                    totalPrice += nextBiggestOfferPrice;
                } else {
                    totalPrice += quantity * price;
                }
            }
        } else {
            if (quantity > biggestOfferQuantity) {
                totalPrice += (quantity / biggestOfferQuantity) * biggestOfferPrice
                        + (quantity % biggestOfferQuantity) * price;
            } else if (quantity.equals(biggestOfferQuantity)) {
                totalPrice += biggestOfferPrice;
            } else {
                totalPrice += quantity * price;
            }
        }
        return totalPrice;
    }
}



