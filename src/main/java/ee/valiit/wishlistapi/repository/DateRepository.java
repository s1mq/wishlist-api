package ee.valiit.wishlistapi.repository;

import ee.valiit.wishlistapi.model.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DateRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Date> getDates() {
        return jdbcTemplate.query("select * from date", mapDaterows);
    }

    public Date getDate(int id) {
        List<Date> dates = jdbcTemplate.query("select * from date where id = ?", new Object[]{id}, mapDaterows);
        return dates.size() > 0 ? dates.get(0) : null;
    }

    public List<Date> getDatesByUser(int userId) {
        return jdbcTemplate.query("select * from date where userId = ?", new Object[]{userId}, mapDaterows);
    }

    public Date getDateByUserAndDateId(int id, int dateId) {
        List<Date> dates = jdbcTemplate.query("select * from date where userId = ? and id = ?", new Object[]{id, dateId}, mapDaterows);
        return dates.size() > 0 ? dates.get(0) : null;
    }

    public boolean dateExists(Date date) {
        Integer count = jdbcTemplate.queryForObject("select count(id) from date where name = ?", new Object[]{date.getName()}, Integer.class);
        return count != null && count > 0;
    }

    public void addDate (Date date) {
        jdbcTemplate.update(
                "insert into date (name, date, userId) values (?, ?, ?)",
                date.getName(), date.getDate(), date.getUserId()
        );
    }

    public void updateDate(Date date) {
        jdbcTemplate.update("update date set name = ?, date = ?, userId = ? where id = ?",
                date.getName(), date.getDate(), date.getUserId(), date.getId()
                );
    }

    public void deleteDate(int id) {
        jdbcTemplate.update("delete from date where id = ?", id);
    }

    private RowMapper<Date> mapDaterows = (row, number) -> {
        Date date = new Date();
        date.setId(row.getInt("id"));
        date.setName(row.getString("name"));
        date.setDate(row.getDate("date") != null ? row.getDate("date").toLocalDate() : null);
        date.setUserId(row.getInt("userId"));
        return date;
    };



}
