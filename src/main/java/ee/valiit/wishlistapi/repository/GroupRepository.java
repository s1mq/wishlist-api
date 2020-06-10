package ee.valiit.wishlistapi.repository;

import ee.valiit.wishlistapi.model.Group;
import ee.valiit.wishlistapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GroupRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Group> getGroups() {
        return jdbcTemplate.query("select * from user_group", mapGroupRows);
    }

    public List<Group> getGroupsByUser(int userId) {
        return jdbcTemplate.query("select * from user_group where userId = ?", new Object[]{userId}, mapGroupRows);
    }



    public Group getGroup(int id) {
        List<Group> groups = jdbcTemplate.query("select * from user_group where id = ?", new Object[]{id}, mapGroupRows);
        return groups.size() > 0 ? groups.get(0) : null;
    }

    public Group getGroupByUserAndGroupId(int id, int groupId) {
        List<Group> groups = jdbcTemplate.query("select * from user_group where userId = ? and id = ?", new Object[]{id, groupId}, mapGroupRows);
        return groups.size() > 0 ? groups.get(0) : null;
    }

    public boolean groupExists(Group group) {
        Integer count = jdbcTemplate.queryForObject("select count(id) from user_group where name = ?", new Object[]{group.getName()}, Integer.class);
        return count != null && count > 0;
    }

    public void addGroup(Group group) {
        jdbcTemplate.update("insert into user_group (name, picture, description, userId) values (?, ?, ?, ?)",
                group.getName(), group.getPicture(), group.getDescription(), group.getUserId()
        );
    }

    public void updateGroup(Group group) {
        jdbcTemplate.update("update user_group set name = ?, picture = ?, description = ?, userId = ? where id = ?",
                group.getName(), group.getPicture(), group.getDescription(), group.getUserId(), group.getId()
        );
    }

    public void deleteGroup(int id) {
        jdbcTemplate.update("delete from user_group where id = ?", id);
    }

    private RowMapper<Group> mapGroupRows = (rs, rowNum) -> {
        Group group = new Group();
        group.setId(rs.getInt("id"));
        group.setName(rs.getString("name"));
        group.setPicture(rs.getString("picture"));
        group.setDescription(rs.getString("description"));
        group.setUserId(rs.getInt("userId"));
        return group;
    };


}
