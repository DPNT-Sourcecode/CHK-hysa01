package befaster.solutions.CHK;

public class FreebieOffer {
    private Character name, freebieItem;
    private Integer quantity, freebieItemQuantity;

    public FreebieOffer(Character name, Integer quantity, Character freebieItem, Integer freebieItemQuantity) {
        this.name = name;
        this.quantity = quantity;
        this.freebieItem = freebieItem;
        this.freebieItemQuantity = freebieItemQuantity;
    }

    public Character getFreebieItem() {
        return freebieItem;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getFreebieItemQuantity() {
        return freebieItemQuantity;
    }
}
