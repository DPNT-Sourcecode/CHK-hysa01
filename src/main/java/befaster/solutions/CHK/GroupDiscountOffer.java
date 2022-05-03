package befaster.solutions.CHK;

import java.util.ArrayList;

public class GroupDiscountOffer {
    private Character name;
    private ArrayList group;
    private Integer requiredNumOfGroupMembers, price;

    public GroupDiscountOffer(Character name, Integer requiredNumOfGroupMembers,
                              Integer price, ArrayList<Character> group) {
        this.name = name;
        this.requiredNumOfGroupMembers = requiredNumOfGroupMembers;
        this.price = price;
        this.group = group;
    }

    public Integer getRequiredNumOfGroupMembers() {
        return requiredNumOfGroupMembers;
    }

    public Integer getPrice() {
        return price;
    }

    public ArrayList getGroup() {
        return group;
    }
}

