package ee.valiit.wishlistapi.model;

public class User {
    private int id;
    private String username;
    private String password;
    private String name;
    private String photo;
    private String uuid;

    public User(int id, String username, String password, String name, String photo, String uuid) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.photo = photo;
        this.uuid = uuid;
    }

    public User(String username, String password, String name, String photo, String uuid) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.photo = photo;
        this.uuid = uuid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
}
