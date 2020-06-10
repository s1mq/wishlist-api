package ee.valiit.wishlistapi.service;

import ee.valiit.wishlistapi.dto.WishlistItemDto;
import ee.valiit.wishlistapi.model.Date;
import ee.valiit.wishlistapi.model.WishlistItem;
import ee.valiit.wishlistapi.repository.WishlistItemRepository;
import ee.valiit.wishlistapi.util.Transformer;
import io.jsonwebtoken.lang.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WishlistItemService {

    @Autowired
    private WishlistItemRepository wishlistItemRepository;

    public List<WishlistItemDto> getWishlistItems(){
        return wishlistItemRepository.getWishlistItems().stream().map(Transformer::toWishlistItemDto).collect(Collectors.toList());
    }

    public WishlistItemDto getWishlistItem(int id) {
        Assert.isTrue(id > 0, "Item ID not specified");
        WishlistItem item = wishlistItemRepository.getWishlistItem(id);
        return Transformer.toWishlistItemDto(item);
    }

    public WishlistItemDto getWishlistItemByUserAndItemId(int id, int itemId) {
        Assert.isTrue(id > 0, "User ID not specified");
        Assert.isTrue(itemId > 0, "Item ID not specified");
        WishlistItem item = wishlistItemRepository.getWishlistItemByUserAndItemId(id, itemId);
        return Transformer.toWishlistItemDto(item);
    }

    public void saveEditWishlistItem(WishlistItemDto wishlistItemDto) {
        Assert.notNull(wishlistItemDto, "Item not specified");
        Assert.hasText(wishlistItemDto.getItemName(), "Item name not specified");
        WishlistItem wishlistItem = Transformer.toWishlistItemModel(wishlistItemDto);
        if (wishlistItem.getId() != 0 && wishlistItem.getId() > 0) {
            wishlistItemRepository.updateWishlistItem(wishlistItem);
        } else {
            Assert.isTrue(!wishlistItemRepository.wishlistItemExists(wishlistItem), "Item with specified name already exists");
            wishlistItemRepository.addWishlistItem(wishlistItem);
        }
    }

    public void deleteWishlistItem(int id) {
        if (id > 0) {
            wishlistItemRepository.deleteWishlistItem(id);
        }
    }


}
