package ee.valiit.wishlistapi.rest;

import ee.valiit.wishlistapi.dto.WishlistItemDto;
import ee.valiit.wishlistapi.model.WishlistItem;
import ee.valiit.wishlistapi.service.WishlistItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wishlistItems")
@CrossOrigin
public class WishlistItemController {

    @Autowired
    private WishlistItemService wishlistItemService;

    @GetMapping
    public List<WishlistItemDto> getWishlistItems() {
        return wishlistItemService.getWishlistItems();
    }

    @GetMapping("/{id}")
    public WishlistItemDto getWishlistItem(@PathVariable("id") int id) {
        return wishlistItemService.getWishlistItem(id);
    }

    @GetMapping("/{id}/{itemId}")
    public WishlistItemDto getWishlistItemByUserAndItemId(@PathVariable("id") int id, @PathVariable("itemId") int itemId){
        return wishlistItemService.getWishlistItemByUserAndItemId(id, itemId);
    }

    @PostMapping("/add")
    public void saveEditWishlistItem(@RequestBody WishlistItemDto wishlistItemDto) {
        wishlistItemService.saveEditWishlistItem(wishlistItemDto);
    }

    @DeleteMapping("/{id}")
    public void deleteWishlistItem(@PathVariable("id") int id) {
        wishlistItemService.deleteWishlistItem(id);
    }
}
