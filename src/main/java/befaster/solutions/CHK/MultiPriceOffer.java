package befaster.solutions.CHK;

public class MultiPriceOffer {
    private Character name;
    private Integer quantity, price;

    public MultiPriceOffer(Character name, Integer quantity, Integer price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Character getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getPrice() {
        return price;
    }
}
