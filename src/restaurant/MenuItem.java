package restaurant;

public class MenuItem {

    private String price;
    private String description;
    private String category;
    private String isItNew;

    public MenuItem(String price, String description, String category, String isItNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isItNew = isItNew;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIsItNew() {
        return isItNew;
    }

    public void setIsItNew(String isItNew) {
        this.isItNew = isItNew;
    }
}
