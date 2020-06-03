package ee.valiit.wishlistapi.repository;

import ee.valiit.wishlistapi.model.WishlistItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WishlistItemRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<WishlistItem> getWishlistItems() {
        return jdbcTemplate.query("select * from wishlist_item", mapWishlistItemRows);
    }

    public WishlistItem getWishlistItem(int id) {
        List<WishlistItem> items = jdbcTemplate.query("select * from wishlist_item where id = ?", new Object[]{id}, mapWishlistItemRows);
        return items.size() > 0 ? items.get(0) : null;
    }

    public boolean wishlistItemExists(WishlistItem wishlistItem) {
        Integer count = jdbcTemplate.queryForObject("select count(id) from wishlist_item where itemName = ?", new Object[]{wishlistItem.getItemName()}, Integer.class);
        return count != null && count > 0;
    }

    public void addWishlistItem(WishlistItem wishlistItem) {
        jdbcTemplate.update("insert into wishlist_item (status, itemName, price, picture, description, link, userId) values (?, ?, ?, ?, ?, ?, ?)",
                wishlistItem.isStatus(), wishlistItem.getItemName(), wishlistItem.getPrice(), wishlistItem.getPicture(),
                wishlistItem.getDescription(), wishlistItem.getLink(), wishlistItem.getUserId()
        );
    }

    public void updateWishlistItem(WishlistItem wishlistItem) {
        jdbcTemplate.update("update wishlist_item set status = ?, itemName = ?, price = ?, picture = ?, description = ?, link = ?, userId = ? where id = ?",
                wishlistItem.isStatus(), wishlistItem.getItemName(), wishlistItem.getPrice(), wishlistItem.getPicture(),
                wishlistItem.getDescription(), wishlistItem.getLink(), wishlistItem.getUserId(), wishlistItem.getId()
                );
    }

    public void deleteWishlistItem(int id) {
        jdbcTemplate.update("delete from wishlist_item where id = ?", id);
    }

    private RowMapper<WishlistItem> mapWishlistItemRows = ((rs, rowNum) -> {
        WishlistItem wishlistItem = new WishlistItem();
        wishlistItem.setId(rs.getInt("id"));
        wishlistItem.setStatus(rs.getBoolean("status"));
        wishlistItem.setItemName(rs.getString("itemName"));
        wishlistItem.setPrice(rs.getInt("price"));
        wishlistItem.setPicture(rs.getString("picture"));
        wishlistItem.setDescription(rs.getString("description"));
        wishlistItem.setLink(rs.getString("link"));
        wishlistItem.setUserId(rs.getInt("userId"));
        return wishlistItem;
    });

}
