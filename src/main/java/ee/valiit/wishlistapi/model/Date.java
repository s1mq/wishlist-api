package ee.valiit.wishlistapi.model;

public class Date {
    private int id;
    private String name;
    private String date;
    private int personId;

    public Date(int id, String name, String date, int personId) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.personId = personId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }
}
