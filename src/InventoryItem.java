/**
 * Created by jakefroeb on 9/6/16.
 */
public class InventoryItem {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    private String name;
    private Integer quantity;


    public InventoryItem(String name, Integer quantity){
        this.name = name;
        this.quantity = quantity;
    }


}
