package ee.valiit.wishlistapi.model;

public class Wishlist {
    private int id;
    private boolean status;
    private String itemName;
    private int price;
    private String picture;
    private String description;
    private String link;
    private int personId;

    public Wishlist(int id, boolean status, String itemName, int price, String picture, String description, String link, int personId) {
        this.id = id;
        this.status = status;
        this.itemName = itemName;
        this.price = price;
        this.picture = picture;
        this.description = description;
        this.link = link;
        this.personId = personId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }
}
