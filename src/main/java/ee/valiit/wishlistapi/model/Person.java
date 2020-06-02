package ee.valiit.wishlistapi.model;

public class Person {
    private int id;
    private String name;
    private String photo;
    private String uuid;
    private int groupId;
    private int userId;

    public Person(int id, String name, String photo, String uuid, int groupId, int userId) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.uuid = uuid;
        this.groupId = groupId;
        this.userId = userId;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
