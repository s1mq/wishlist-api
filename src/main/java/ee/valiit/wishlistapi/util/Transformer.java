package ee.valiit.wishlistapi.util;

import ee.valiit.wishlistapi.dto.DateDto;
import ee.valiit.wishlistapi.dto.GroupDto;
import ee.valiit.wishlistapi.dto.WishlistItemDto;
import ee.valiit.wishlistapi.model.Date;
import ee.valiit.wishlistapi.model.Group;
import ee.valiit.wishlistapi.model.WishlistItem;

public class Transformer {

    public static Date toDateModel(DateDto initialObject) {
        Date resultingObject = new Date();
        resultingObject.setId(initialObject.getId());
        resultingObject.setName(initialObject.getName());
        resultingObject.setDate(initialObject.getDate());
        resultingObject.setUserId(initialObject.getUserId());

        return resultingObject;
    }

    public static DateDto toDateDto(Date initialObject){
        if (initialObject == null) {
            return null;
        }

        DateDto resultingObject = new DateDto();
        resultingObject.setId(initialObject.getId());
        resultingObject.setName(initialObject.getName());
        resultingObject.setDate(initialObject.getDate());
        resultingObject.setUserId(initialObject.getUserId());

        return resultingObject;
    }

    public static WishlistItem toWishlistItemModel(WishlistItemDto initialObject) {
        WishlistItem resultingObject = new WishlistItem();
        resultingObject.setId(initialObject.getId());
        resultingObject.setStatus(initialObject.isStatus());
        resultingObject.setItemName(initialObject.getItemName());
        resultingObject.setPrice(initialObject.getPrice());
        resultingObject.setPicture(initialObject.getPicture());
        resultingObject.setDescription(initialObject.getDescription());
        resultingObject.setLink(initialObject.getLink());
        resultingObject.setUserId(initialObject.getUserId());
        return resultingObject;
    }

    public static WishlistItemDto toWishlistItemDto(WishlistItem initialObject){
        if (initialObject == null) {
            return null;
        }

        WishlistItemDto resultingObject = new WishlistItemDto();
        resultingObject.setId(initialObject.getId());
        resultingObject.setStatus(initialObject.isStatus());
        resultingObject.setItemName(initialObject.getItemName());
        resultingObject.setPrice(initialObject.getPrice());
        resultingObject.setPicture(initialObject.getPicture());
        resultingObject.setDescription(initialObject.getDescription());
        resultingObject.setLink(initialObject.getLink());
        resultingObject.setUserId(initialObject.getUserId());

        return resultingObject;
    }

    public static Group toGroupModel(GroupDto initialObject) {
        Group resultingObject = new Group();
        resultingObject.setId(initialObject.getId());
        resultingObject.setName(initialObject.getName());
        resultingObject.setPicture(initialObject.getPicture());
        resultingObject.setDescription(initialObject.getDescription());
        resultingObject.setUserId(initialObject.getUserId());

        return resultingObject;
    }

    public static GroupDto toGroupDto(Group initialObject){
        if (initialObject == null) {
            return null;
        }

        GroupDto resultingObject = new GroupDto();
        resultingObject.setId(initialObject.getId());
        resultingObject.setName(initialObject.getName());
        resultingObject.setPicture(initialObject.getPicture());
        resultingObject.setDescription(initialObject.getDescription());
        resultingObject.setUserId(initialObject.getUserId());

        return resultingObject;
    }


}
