package ee.valiit.wishlistapi.repository;

import ee.valiit.wishlistapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean userExists(String username) {
        Integer count = jdbcTemplate.queryForObject(
                "select count(id) from user where username = ?",
                new Object[]{username},
                Integer.class
        );
        return count != null && count > 0;
    }

    public void addUser(User user) {
        jdbcTemplate.update("insert into `user` (`username`, `password`) values (?, ?)", user.getUsername(), user.getPassword());
    }

    public User getUserByUsername(String username) {
        List<User> users = jdbcTemplate.query(
                "select * from `user` where `username` = ?",
                new Object[]{username},
                (row, number) -> new User(
                        row.getInt("id"),
                        row.getString("username"),
                        row.getString("password"),
                        row.getString("name"),
                        row.getString("photo"),
                        row.getString("uuid")
                )
        );
        return users.size() > 0 ? users.get(0) : null;
    }
}
